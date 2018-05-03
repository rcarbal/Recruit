package recruitapp.poslab.rcarb.getmichaeljacksonsongs.utils;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import recruitapp.poslab.rcarb.getmichaeljacksonsongs.objects.SongsObject;

public class AppDataUtils {
    public static JSONObject tryToMakeJsonArray(String stringData) {

        //Create the Json object out of the strings.
        @SuppressWarnings("UnusedAssignment")
        JSONObject jsonData = null;

        try {
            jsonData = new JSONObject(stringData);
        } catch (JSONException e) {
            Log.e("APpDataUtils", "The string data could not be converted to JSONArray " + e);
            e.printStackTrace();
            return null;
        }
        return jsonData;
    }

    public static ArrayList<SongsObject> convertJsonArrayToSongsObject(JSONArray array) throws JSONException {
        assert array!= null;

        ArrayList<SongsObject> songsArray = new ArrayList<>();
        for(int i = 0; i < array.length(); i++){
            SongsObject song = new SongsObject();
            JSONObject object = null;
            try {
                object = array.getJSONObject(i);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            assert object != null;
            if (object.has("wrapperType")){
                song.setWrapperType(object.getString("wrapperType"));
            }
            if (object.has("kind")){
                song.setKind(object.getString("kind"));
            }
            if (object.has("artistId")){
                song.setArtistId(object.getInt("artistId"));
            }
            if (object.has("collectionId")){
                song.setCollectionId(object.getInt("collectionId"));
            }
            if (object.has("trackId")){
                song.setTrackId(object.getInt("trackId"));
            }
            if (object.has("artistName")){
                song.setArtistName(object.getString("artistName"));
            }
            if (object.has("collectionName")){
                song.setCollectionName(object.getString("collectionName"));
            }
            if (object.has("trackName")){
                song.setTrackName(object.getString("trackName"));
            }
            if (object.has("collectionCensoredName")){
                song.setCollectionCensoredNmae(object.getString("collectionCensoredName"));
            }
            if (object.has("trackCensoredName")){
                song.setTrackCensoredName(object.getString("trackCensoredName"));
            }
            if (object.has("artistViewUrl")){
                song.setArtistViewUrl(object.getString("artistViewUrl"));
            }
            if (object.has("collectionViewUrl")){
                song.setCollectionViewUrl(object.getString("collectionViewUrl"));
            }
            if (object.has("trackViewUrl")){
                song.setTrackViewUrl(object.getString("trackViewUrl"));
            }
            if (object.has("previewUrl")){
                song.setPreviewUrl(object.getString("previewUrl"));
            }
            if (object.has("artworkUrl30")){
                song.setArtworkUrl130(object.getString("artworkUrl30"));
            }
            if (object.has("artworkUrl60")){
                song.setArtworkUrl160(object.getString("artworkUrl60"));
            }
            if (object.has("artworkUrl100")){
                song.setArtworkUrl100(object.getString("artworkUrl100"));
            }
            if (object.has("collectionPrice")){
                song.setCollectionPrice(object.getLong("collectionPrice"));
            }
            if (object.has("trackPrice")){
                song.setTrackPrice(object.getLong("trackPrice"));
            }
            if (object.has("releaseDate")){
                song.setReleaseDate(object.getString("releaseDate"));
            }
            if (object.has("collectionExplicitness")){
                song.setCollectionExplicitness(object.getString("collectionExplicitness"));
            }
            if (object.has("trackExplicitness")){
                song.setTrackExplicitness(object.getString("trackExplicitness"));
            }
            if (object.has("discCount")){
                song.setDiscCount(object.getInt("discCount"));
            }

            if (object.has("discNumber")){
                song.setDiscNumber(object.getInt("discNumber"));
            }

            if (object.has("trackCount")){
                song.setTrackCount(object.getInt("trackCount"));
            }
            if (object.has("trackNumber")){
                song.setTrackNumber(object.getInt("trackNumber"));
            }
            if (object.has("trackTimeMillis")){
                song.setTrackTimeMillis(object.getInt("trackTimeMillis"));
            }
            if (object.has("country")){
                song.setCountry(object.getString("country"));
            }
            if (object.has("currency")){
                song.setCurrency(object.getString("currency"));
            }
            if (object.has("primaryGenreName")){
                song.setPrimaryGenreName(object.getString("primaryGenreName"));
            }
            if (object.has("isStreamable")){
                song.setIsStreamable(object.getBoolean("isStreamable"));
            }
            songsArray.add(song);
            Log.d("ADDED ",""+i);

        }
        return songsArray;
    }
}
