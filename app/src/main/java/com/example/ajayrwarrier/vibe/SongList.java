package com.example.ajayrwarrier.vibe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SongList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songlist);
        Button play = (Button) findViewById(R.id.play);
        Button playlist = (Button) findViewById(R.id.playlist);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SongList.this, NowPlaying.class);
                startActivity(intent);
            }
        });
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SongList.this, Playlist.class);
                startActivity(intent);
            }
        });
    }

}
