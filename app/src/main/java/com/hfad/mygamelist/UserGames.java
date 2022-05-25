package com.hfad.mygamelist;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class UserGames{
    private String name;
    private int idImage;

    public UserGames(String name, int idImage) {
        this.name = name;
        this.idImage = idImage;
    }

    public String getName() {
        return name;
    }

    public int getIdImage() {
        return idImage;
    }

    public int getId() {
        return name.hashCode();
    }

    /*public static UserGames[] Games = {
        new UserGames("Xenoblade Chronicles", R.drawable.xenobladecover),
        new UserGames("Yakuza 0", R.drawable.yakuza0cover),
        new UserGames("Kid Icarus Uprising", R.drawable.kidicaruscover)
    };

    public static UserGames getItem(int id) {
        for (UserGames item : Games) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }*/
}
