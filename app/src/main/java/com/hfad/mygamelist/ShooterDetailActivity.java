package com.hfad.mygamelist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ShooterDetailActivity extends AppCompatActivity {
    public static final String EXTRA_SHOOTERID = "shooterId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int shooterId = (Integer)getIntent().getExtras().get(EXTRA_SHOOTERID);
        Shooter shooter = Shooter.games[shooterId];

        super.onCreate(savedInstanceState);
        setContentView(R.layout.shooter_activity_detail);

        ShooterDetailFragment frag = (ShooterDetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.shooter_detail_frag);
        frag.setShooter(shooterId);
    }
}