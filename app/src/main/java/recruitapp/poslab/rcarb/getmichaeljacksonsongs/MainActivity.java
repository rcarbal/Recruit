package recruitapp.poslab.rcarb.getmichaeljacksonsongs;

import android.app.LoaderManager;
import android.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import recruitapp.poslab.rcarb.getmichaeljacksonsongs.adaptors.MainAdaptor;
import recruitapp.poslab.rcarb.getmichaeljacksonsongs.objects.SongsObject;
import recruitapp.poslab.rcarb.getmichaeljacksonsongs.loaders.GetJsonAsyncLoader;

public class MainActivity extends AppCompatActivity {
    private static final int START_JSON_LOADER = 1;

    RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setup recyclerview
        mRecyclerView = findViewById(R.id.main_rv);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        getJsonFromUrl();
    }

    private void getJsonFromUrl() {
        LoaderManager loaderManager = getLoaderManager();
        Loader<ArrayList<SongsObject>> getJson = loaderManager.getLoader(START_JSON_LOADER);
        if (getJson == null) {
            getLoaderManager().initLoader(START_JSON_LOADER, null, getJsonFromUri);
        } else {
            getLoaderManager().restartLoader(START_JSON_LOADER, null, getJsonFromUri);
        }
    }

    private final LoaderManager.LoaderCallbacks<ArrayList<SongsObject>> getJsonFromUri =
            new LoaderManager.LoaderCallbacks<ArrayList<SongsObject>>() {
                @Override
                public Loader<ArrayList<SongsObject>> onCreateLoader(int id, Bundle args) {
                    return new GetJsonAsyncLoader(MainActivity.this);
                }

                @Override
                public void onLoadFinished(Loader<ArrayList<SongsObject>> loader, ArrayList<SongsObject> data) {
                    mAdapter = new MainAdaptor(data);
                    mRecyclerView.setAdapter(mAdapter);
                }

                @Override
                public void onLoaderReset(Loader<ArrayList<SongsObject>> loader) {

                }
            };

}
