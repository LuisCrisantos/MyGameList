package com.hfad.mygamelist;

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
}
