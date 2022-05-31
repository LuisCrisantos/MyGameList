package com.hfad.mygamelist.Activities;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.hfad.mygamelist.InsertGame;
import com.hfad.mygamelist.R;
import com.hfad.mygamelist.RPGDetailFragment;

public class RPGDetailActivity extends AppCompatActivity{
    public static final String EXTRA_RPGID = "rpgId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int rpgId = (Integer) getIntent().getExtras().get(EXTRA_RPGID);
        //RPG rpg = RPG.games[rpgId];

        super.onCreate(savedInstanceState);
        setContentView(R.layout.rpg_activity_detail);
        RPGDetailFragment frag = (RPGDetailFragment) getSupportFragmentManager().findFragmentById(R.id.rpg_detail_frag);
        frag.setRPG(rpgId);
    }

}
