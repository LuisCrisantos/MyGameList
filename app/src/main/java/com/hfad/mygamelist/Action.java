package com.hfad.mygamelist;

public class Action {
    private String name;
    private String description;
    private String score;
    private String developers;
    private String publishers;
    private String platforms;
    private String rel_date;
    private int imageResourceId;

    public static final Action[] games = {
            new Action("Yakuza 0", "In December, 1988, two unlikely figures from the Yakuza world, " +
                    "Kazuma Kiryu of the Kanto region and Goro Majima of the Kansai Region, have suddenly found themselves " +
                    "getting involved in the terrible events of the so-called \"Empty Lot\" dispute, which is the centrepiece " +
                    "of power struggle for all the dark organizations across Japan. In order to find out the truth behind such " +
                    "a power struggle, as well as maintain their own innocence and safety, they set out to investigate all the events surrounding the \"Empty Lot\" incident.",
                    "9.7", "Ryu ga Gotoku Studio", "Sega", "PS3, PS4, Xbox One, PC", "12/03/2015", R.drawable.yakuza0cover),
            new Action("The Legend of Zelda Breath of the Wild", "Link awakens from his slumber in the " +
                    "Shrine of Resurrection to a mysterious voice, not knowing who or where he is. Finding a strange device nearby, " +
                    "the Sheikah Slate once used by Princess Zelda herself, he walks out onto the Great Plateau to meet an Old Man.\n" +
                    "The old man, believing that Link's fragile memory is now ready to be regaled with the story of Hyrule's demise, " +
                    "then tells Link that he is actually the spirit of King Rhoam from 100 years ago. He details the events of his kingdom's " +
                    "fall, including the discovery of the ancient relics, return of Calamity Ganon, and fact that Link is the revitalized knight" +
                    " who valiantly fell in battle defending the princess. He tells Link that Princess Zelda is the one who has been calling out to him," +
                    " and that she has been gradually losing her power to contain Ganon within the castle. He warns that soon Zelda's power will be exhausted," +
                    " after which Ganon will be free to regenerate and consume the land of Hyrule unopposed.>n" +
                    "Link sets out on his journey to regain his memories and re-harness the control and support of the Divine Beasts in his new quest to defeat Ganon.",
                    "9.9", "Nintendo EPD", "Nintendo", "Nintendo Switch", "03/03/2017", R.drawable.botwcover),
            new Action("Persona 5 Strikers", "After a few months after the events ofn Persona 5, its group of protagonists meet again" +
                    " to enjoy their well-deserved summer vacations and disconnect for a few days from their student life. However, " +
                    "it doesn't take long for things to go wrong when they discover that a new threat is once again looming over the " +
                    "Metaverse and the real world, which ends up leading to a road trip across Japan that will take them to visit some " +
                    "of its most interesting cities and locations. iconic, but also to explore all kinds of dungeons and face " +
                    "multitudes of Shadows who will not hesitate to stand in their way.",
                    "8.8", "Atlus, Koei Techmo", "Sega", "Nintendo Switch, PS4, PC", "20/02/2020", R.drawable.p5scover)
    };

    private Action(String name, String description, String score, String developers, String publishers, String platforms, String rel_date, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
        this.score = score;
        this.developers = developers;
        this.publishers = publishers;
        this.platforms = platforms;
        this.rel_date = rel_date;
    }
    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public String getScore() {
        return score;
    }
    public String getDevelopers() {
        return developers;
    }
    public String getPublishers() {
        return publishers;
    }
    public String getPlatforms() {
        return platforms;
    }
    public String getRel_date() {
        return rel_date;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
    public String toString() {
        return this.name;
    }
}