package com.example.recycleviewer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Activity_SautiSol extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__sauti_sol);

        ArrayList<Music> music = new ArrayList<Music>();
        music.add(new Music("Sauti Sol", "Suzana", R.drawable.sautisol));
        music.add(new Music("Sauti Sol", "Range rover ", R.drawable.sautisol));
        music.add(new Music("Sauti Sol", "Sura yako", R.drawable.sautisol));
        music.add(new Music("Sauti Sol", "Rhumba ya Japan", R.drawable.sautisol));
        music.add(new Music("Sauti Sol", "Midnight train", R.drawable.sautisol));
        music.add(new Music("Sauti Sol", "Kuliko jana", R.drawable.sautisol));
        music.add(new Music("Sauti Sol", "Unconditional Bae", R.drawable.sautisol));
        music.add(new Music("Sauti Sol", "Melanin", R.drawable.sautisol));
        music.add(new Music("Sauti Sol", "Nenda lote", R.drawable.sautisol));
        music.add(new Music("Sauti Sol", "Extravaganza", R.drawable.sautisol));
        music.add(new Music("Sauti Sol", "Isabella", R.drawable.sautisol));
        music.add(new Music("Sauti Sol", "My everything", R.drawable.sautisol));

        // Create an {@link MusicAdapter}, whose data source is a list of
        // {@link music}s. The adapter knows how to create list item views for each item
        // in the list.
        MusicAdapter musicAdapter = new MusicAdapter(music);

        // Lookup the recyclerview in activity layout
        RecyclerView sautiSol_music = (RecyclerView) findViewById(R.id.recyclerViewList);

        // Attach the adapter to the recyclerview to populate items
        sautiSol_music.setAdapter(musicAdapter);

        // Set layout manager to position the items
        sautiSol_music.setLayoutManager(new LinearLayoutManager(this));
        // That's all!

    }
}