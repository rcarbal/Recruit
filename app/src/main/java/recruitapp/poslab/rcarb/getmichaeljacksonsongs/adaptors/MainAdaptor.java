package recruitapp.poslab.rcarb.getmichaeljacksonsongs.adaptors;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import recruitapp.poslab.rcarb.getmichaeljacksonsongs.R;
import recruitapp.poslab.rcarb.getmichaeljacksonsongs.objects.SongsObject;

public class MainAdaptor extends RecyclerView.Adapter<MainAdaptor.ImageViewHolder>{

    private ArrayList<SongsObject> mSongs;

    public MainAdaptor(ArrayList<SongsObject> songs) {
        mSongs = songs;
    }


    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        int viewToBeInflated = R.layout.image_view_holder;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldBeAttachedImeidately = false;

        View view = inflater.inflate(viewToBeInflated, parent, shouldBeAttachedImeidately);
        LayoutInflater layoutInflater = LayoutInflater.from(context);


        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        Context context = holder.mImageView.getContext();


        int songId = mSongs.get(position).getTrackId();

        holder.mImageView.setContentDescription(Integer.toString(songId));
        holder.mTextView.setText(mSongs.get(position).getTrackName());
    }

    @Override
    public int getItemCount() {
        return mSongs.size();
    }

    class ImageViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {
        final ImageView mImageView;
        final TextView mTextView;

        public ImageViewHolder(View itemView) {
            super(itemView);

            //cast the ImageView.
            mImageView = itemView.findViewById(R.id.rv_image_view);
            mTextView = itemView.findViewById(R.id.rv_song_title);

            //set the onClickListener on the itemView in the viewholder's constructor
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int clickedPosition = getAdapterPosition();
            String movieId = (String) mImageView.getContentDescription();
            int movieIdInt = Integer.valueOf(movieId);
            //mOnClick.onItemClick(clickedPosition, movieIdInt);
        }
    }
}
