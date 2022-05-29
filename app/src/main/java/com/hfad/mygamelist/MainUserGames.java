package com.hfad.mygamelist;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;

public class MainUserGames extends AppCompatActivity {
    GridView games;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_game);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ArrayList<UserGames> courseModelArrayList = new ArrayList<UserGames>();
        games = findViewById(R.id.gridUserGame);
        int i = 0;

        MyGameListDatabaseHelper mygamelist = new MyGameListDatabaseHelper(this);
        SQLiteDatabase db = mygamelist.getWritableDatabase();

        Cursor cursor = db.rawQuery("SELECT NAME, IMAGE_RESOURCE_ID FROM  USER_GAMES",null);

        String[] array1 = new String[cursor.getCount()];
        int[] array2 = new int[cursor.getCount()];

        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {

            array1[i] = cursor.getString(0);
            array2[i]= cursor.getInt(1);
            courseModelArrayList.add(new UserGames(array1[i], array2[i]));
            i++;
            cursor.moveToNext();
        }
        cursor.close();
        db.close();

        UserGameAdapter adapter = new UserGameAdapter(this, courseModelArrayList);
        games.setAdapter(adapter);
    }

}
