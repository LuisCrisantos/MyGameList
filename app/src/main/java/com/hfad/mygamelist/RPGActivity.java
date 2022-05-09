package com.hfad.mygamelist;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RPGActivity extends Activity {
    public static final String EXTRA_RPGID = "rpgId";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpg);
//Get the drink from the intent
        int rpgId = (Integer)getIntent().getExtras().get(EXTRA_RPGID);
        RPG rpg = RPG.games[rpgId];
//Populate the drink name
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(rpg.getName());
//Populate the drink description
        TextView description = (TextView)findViewById(R.id.description);
        description.setText(rpg.getDescription());
//Populate the drink image
        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(rpg.getImageResourceId());
        photo.setContentDescription(rpg.getName());
    }
}
