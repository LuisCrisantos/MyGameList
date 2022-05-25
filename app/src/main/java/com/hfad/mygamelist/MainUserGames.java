package com.hfad.mygamelist;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.hfad.mygamelist.R;
import com.hfad.mygamelist.UserGameAdapter;
import com.hfad.mygamelist.UserGames;

import java.util.ArrayList;

public class MainUserGames extends AppCompatActivity {
    GridView games;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_game);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        games = findViewById(R.id.gridUserGame);

        ArrayList<UserGames> courseModelArrayList = new ArrayList<UserGames>();
        courseModelArrayList.add(new UserGames("Xenoblade Chronicles", R.drawable.xenobladecover));
        courseModelArrayList.add(new UserGames("Yakuza 0", R.drawable.yakuza0cover));
        courseModelArrayList.add(new UserGames("Kid Icarus Uprising", R.drawable.kidicaruscover));


        UserGameAdapter adapter = new UserGameAdapter(this, courseModelArrayList);
        games.setAdapter(adapter);
    }

}
