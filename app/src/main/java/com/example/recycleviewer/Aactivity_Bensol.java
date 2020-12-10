package com.example.recycleviewer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Aactivity_Bensol extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_bensol);

        ArrayList<Music> music = new ArrayList<Music>();
        music.add(new Music("Bensol", "Niombee", R.drawable.bensol));
        music.add(new Music("Bensol", "Pedi", R.drawable.bensol));
        music.add(new Music("Bensol", "salama", R.drawable.bensol));
        music.add(new Music("Bensol", "forget you", R.drawable.bensol));
        music.add(new Music("Bensol", "sweet sens", R.drawable.bensol));
        music.add(new Music("Bensol", "favourite song", R.drawable.bensol));
        music.add(new Music("Bensol", "No kisses", R.drawable.bensol));
        music.add(new Music("Bensol", "Mungu Pekee", R.drawable.bensol));
        music.add(new Music("Bensol", "Ndom", R.drawable.bensol));
        music.add(new Music("Bensol", "Rhumba ya Japan", R.drawable.bensol));
        music.add(new Music("Bensol", "Extravaganza", R.drawable.bensol));
        music.add(new Music("Bensol", "ile kitu", R.drawable.bensol));
        music.add(new Music("Bensol", "Lucy", R.drawable.bensol));
        music.add(new Music("Bensol", "boyz", R.drawable.bensol));
        music.add(new Music("Bensol", "Kenya yetu", R.drawable.bensol));

        // Create an {@link MusicAdapter}, whose data source is a list of
        // {@link music}s. The adapter knows how to create list item views for each item
        // in the list.
        MusicAdapter musicAdapter = new MusicAdapter(music);

        // Lookup the recyclerview in activity layout
        RecyclerView benSol_music = (RecyclerView) findViewById(R.id.recyclerViewList);

        // Attach the adapter to the recyclerview to populate items
        benSol_music.setAdapter(musicAdapter);

        // Set layout manager to position the items
        benSol_music.setLayoutManager(new LinearLayoutManager(this));
        // That's all!

    }
}