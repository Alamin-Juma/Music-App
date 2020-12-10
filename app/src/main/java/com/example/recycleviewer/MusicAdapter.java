package com.example.recycleviewer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

// Create the basic adapter extending from RecyclerView.Adapter
// Note that we specify the custom ViewHolder which gives us access to our views
public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.ViewHolder> {

    // Store a member variable for the contacts
    private List<Music> music;

    // Pass in the contact array into the constructor
    public MusicAdapter(List<Music> mMusic) {
        music = mMusic;
    }

    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    public class ViewHolder extends RecyclerView.ViewHolder {

        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView songTextView;
        public TextView singerTextView;
        public ImageView iconView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // Find the TextView in the list_item.xml layout with the ID version_name
             songTextView = (TextView) itemView.findViewById(R.id.song_name);

            // Find the TextView in the list_item.xml layout with the ID version_number
             singerTextView = (TextView) itemView.findViewById(R.id.singer_name);

            // Find the ImageView in the list_item.xml layout with the ID list_item_icon
             iconView = (ImageView) itemView.findViewById(R.id.list_item_icon);
        }

    }

    // Usually involves inflating a layout from XML and returning the holder
    @NonNull
    @Override
    public MusicAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View musicView = inflater.inflate(R.layout.list_item, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(musicView);
        return viewHolder;
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(MusicAdapter.ViewHolder holder, int position) {
        // Get the data model based on position
        Music musicObj = music.get(position);

        // Set item views based on your views and data model
        TextView songTextView = holder.songTextView;
        songTextView.setText(musicObj.getSongName());

        TextView singerTextView = holder.singerTextView;
        singerTextView.setText(musicObj.getSingerName());

        ImageView songImage = holder.iconView;
        songImage.setImageResource(musicObj.getmImageResourceId());
    }

    @Override
    public int getItemCount() {
        return music.size();
    }
}
