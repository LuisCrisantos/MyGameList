package com.hfad.mygamelist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class RPGDetailFragment extends Fragment {
    private long rpgId;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            rpgId = savedInstanceState.getLong("rpgId");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.name);
            RPG rpg = RPG.games[(int) rpgId];
            title.setText(rpg.getName());

            TextView description = (TextView) view.findViewById(R.id.description);
            description.setText(rpg.getDescription());

            ImageView photo = (ImageView) view.findViewById(R.id.photo);
            photo.setImageResource(rpg.getImageResourceId());
            photo.setContentDescription(rpg.getName());

            TextView score = (TextView) view.findViewById(R.id.score);
            score.setText(rpg.getScore());

            TextView developers = (TextView) view.findViewById(R.id.developers);
            developers.setText(rpg.getDevelopers());

            TextView publishers = (TextView) view.findViewById(R.id.publishers);
            publishers.setText(rpg.getPublishers());

            TextView platforms = (TextView) view.findViewById(R.id.platforms);
            platforms.setText(rpg.getPlatforms());

            TextView rel_date = (TextView) view.findViewById(R.id.rel_date);
            rel_date.setText(rpg.getRel_date());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putLong("rpgId", rpgId);
    }

    public void setRPG(long id) {
        this.rpgId = id;
    }
}
