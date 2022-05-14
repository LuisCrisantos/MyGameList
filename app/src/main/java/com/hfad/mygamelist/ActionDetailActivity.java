package com.hfad.mygamelist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ActionDetailActivity extends AppCompatActivity {
    public static final String EXTRA_ACTIONID = "actionId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int actionId = (Integer)getIntent().getExtras().get(EXTRA_ACTIONID);
        Action action = Action.games[actionId];

        super.onCreate(savedInstanceState);
        setContentView(R.layout.action_activity_detail);

        ActionDetailFragment frag = (ActionDetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.action_detail_frag);
        frag.setAction(actionId);
    }
}