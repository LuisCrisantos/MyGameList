package com.hfad.mygamelist;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RPGDetailActivity extends AppCompatActivity {
    public static final String EXTRA_RPGID = "rpgId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int rpgId = (Integer)getIntent().getExtras().get(EXTRA_RPGID);
        RPG rpg = RPG.games[rpgId];

        super.onCreate(savedInstanceState);
        setContentView(R.layout.rpg_activity_detail);

        RPGDetailFragment frag = (RPGDetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.rpg_detail_frag);
        frag.setRPG(rpgId);
    }
}
