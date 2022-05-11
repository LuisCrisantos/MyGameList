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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_rpg_detail, container, false);
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
        }
    }

    public void setRPG(long id) {
        this.rpgId = id;
    }
}
