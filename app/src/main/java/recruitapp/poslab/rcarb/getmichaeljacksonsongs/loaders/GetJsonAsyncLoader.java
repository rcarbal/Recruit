package recruitapp.poslab.rcarb.getmichaeljacksonsongs.loaders;

import android.content.AsyncTaskLoader;
import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import recruitapp.poslab.rcarb.getmichaeljacksonsongs.objects.SongsObject;
import recruitapp.poslab.rcarb.getmichaeljacksonsongs.utils.AppDataUtils;
import recruitapp.poslab.rcarb.getmichaeljacksonsongs.utils.AppNetworkUtils;

public class GetJsonAsyncLoader extends AsyncTaskLoader<ArrayList<SongsObject>> {
    public GetJsonAsyncLoader(Context context) {
        super(context);
    }

    @Override
    public ArrayList<SongsObject> loadInBackground() {
        URL url = null;
        try {
            url = new URL("https://itunes.apple.com/search?term=Michael+jackson");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        assert url != null;

        //Get the String
        String response = AppNetworkUtils.getResponseFromHttpUrl(url);
        JSONObject jsonObject = AppDataUtils.tryToMakeJsonArray(response);
        JSONArray songArray = null;
        try {
            assert jsonObject != null;
            songArray = jsonObject.getJSONArray("results");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        ArrayList<SongsObject> songs = null;
        try {
            assert songArray != null;
            songs = AppDataUtils.convertJsonArrayToSongsObject(songArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return songs;

    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }
}
