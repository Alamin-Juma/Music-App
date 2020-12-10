package com.example.recycleviewer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find the imageView that shows the Sautisol category
        Button sautisolbtn = findViewById(R.id.sautisolAlbum);
        // Set a click listener on that View
        sautisolbtn.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the sautisolImage category is clicked on.
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link SecondActivity}
                Intent intent = new Intent(MainActivity.this, Activity_SautiSol.class);
                startActivity(intent);
            }
        });

        // Find the imageView that shows the Baisa category
        Button baisaBtn = findViewById(R.id.baisaAlbum);
        // Set a click listener on that View
        baisaBtn.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the baisaImage category is clicked on.
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link SecondActivity}
                Intent intent = new Intent(MainActivity.this, Activity_Baisa.class);
                startActivity(intent);
            }
        });

        // Find the Button that shows the kondeboi category
        Button kondeBtn = findViewById(R.id.kondeboiAlbum);
        // Set a click listener on that View
        kondeBtn.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the kondeImage category is clicked on.
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link SecondActivity}
                Intent intent = new Intent(MainActivity.this, Activity_Kondeboi.class);
                startActivity(intent);
            }
        });

        // Find the Button that shows the Bensol category
        Button bensolBtn = findViewById(R.id.bensolAlbum);
        // Set a click listener on that View
        bensolBtn.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the bensolImage category is clicked on.
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link SecondActivity}
                Intent intent = new Intent(MainActivity.this, Aactivity_Bensol.class);
                startActivity(intent);
            }
        });
    }
}
