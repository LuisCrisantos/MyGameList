package com.hfad.mygamelist;

public class RPG {
    private String name;
    private String description;
    private String score;
    private String developers;
    private String publishers;
    private String platforms;
    private String rel_date;
    private int imageResourceId;

    public static final RPG[] games = {
            new RPG("Xenoblade Chronicles Definitive Edition", "Long ago, the world was nothing more than an endless sea " +
                    "cloaked in a boundless sky, reaching as far as could possibly be imagined.\n"+
                    "Then two great titans came into existence: the Bionis and the Mechonis. " +
                    "The titans were locked in a timeless battle. Until at last...\n" +
                    "Only their lifeless corpses remained.\n"+"Eons have passed. Now our world, " +
                    "this vast land stretching across the remains of the Bionis, is under attack from a relentless force known as the Mechon.",
                    "9.9", "Monolithsoft", "Nintendo", "Nintendo Switch", "29/05/2020", R.drawable.xenobladecover),

            new RPG("Persona 3 FES", "Time never waits.\n" +
                    "It delivers all equally to the same end.\n" +
                    "You, who wish to safeguard the future, however limited it may be...\n" +
                    "You will be given one year; go forth without falter with your heart as your guide...",
                    "9.7", "Atlus", "Sony", "PS2", "22/04/2008",R.drawable.persona3cover),

            new RPG("Yakuza Like a Dragon", "Ichiban Kasuga, born and raised in a soapland in Kamurocho " +
                    "without ever knowing his real parents. After his life is saved at the age of fiteen by Masumi Arakawa, " +
                    "a yakuza, Kasuga decidates his life to serving the Arakawa Family, until the first day of the 21st century. " +
                    "Kasuga is asked by Arakawa to take the fall for Sawashiro, captain of the Arakawa Family, for a murder he had committed. " +
                    "Convinced that the day has come for him to repay Arakawa, Kasuga happily obliges and turns himself in to the police.",
                    "9.5", "Ryu ga Gotoku Studio", "Sega", "PS4, PS5, Xbox One, \nXbox Series X/S, PC", "16/01/2020",R.drawable.yakuza7cover)
    };

    private RPG(String name, String description, String score, String developers, String publishers, String platforms, String rel_date, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.score = score;
        this.developers = developers;
        this.publishers = publishers;
        this.platforms = platforms;
        this.rel_date = rel_date;
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
    public String toString() {
        return this.name;
    }
}
