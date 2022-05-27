package com.hfad.mygamelist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class UserGameAdapter extends ArrayAdapter<UserGames> {
    public UserGameAdapter(@NonNull Context context, ArrayList<UserGames> courseModelArrayList) {
        super(context, 0, courseModelArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitemView = convertView;
        if (listitemView == null) {
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.grid_item, parent, false);
        }
        UserGames userGames = getItem(position);
        TextView gameName = listitemView.findViewById(R.id.game_name);
        ImageView gameImage = listitemView.findViewById(R.id.game_image);
        gameName.setText(userGames.getName());
        gameImage.setImageResource(userGames.getIdImage());
        return listitemView;
    }
}