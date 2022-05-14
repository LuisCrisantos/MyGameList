package com.hfad.mygamelist;

public class Action {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Action[] games = {
            new Action("Yakuza 0", "In December, 1988, two unlikely figures from the Yakuza world, " +
                    "Kazuma Kiryu of the Kanto region and Goro Majima of the Kansai Region, have suddenly found themselves " +
                    "getting involved in the terrible events of the so-called \"Empty Lot\" dispute, which is the centrepiece " +
                    "of power struggle for all the dark organizations across Japan. In order to find out the truth behind such " +
                    "a power struggle, as well as maintain their own innocence and safety, they set out to investigate all the events surrounding the \"Empty Lot\" incident.",
                    R.drawable.yakuza0cover),
            new Action("The Legend of Zelda Breath of the Wild", "",
                    R.drawable.botwcover),
            new Action("Persona 5 Strikers", "",
                    R.drawable.p5scover)
    };

    private Action(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }
    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
    public String toString() {
        return this.name;
    }
}