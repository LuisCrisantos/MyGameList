package com.hfad.mygamelist;

public class RPG {
    private String name;
    private String description;
    private int imageResourceId;

    public static final RPG[] games = {
            new RPG("Xenoblade Chronicles", "Long ago, the world was nothing more than an endless sea\n" +
                    "cloaked in a boundless sky, reaching as far as could possibly be imagined.\n"+
                    "Then two great titans came into existence: the Bionis and the Mechonis. \nThe titans were locked in a timeless battle."+" Until at last...\n" +
                    "Only their lifeless corpses remained.\n"+"Eons have passed."+"\nNow our world, this vast land stretching across the remains of the Bionis, is under attack from a relentless force known as the Mechon.",
                    R.drawable.xenobladecover),
            new RPG("Persona 3 FES", "Time never waits.\n" +
                    "It delivers all equally to the same end.\n" +
                    "You, who wish to safeguard the future, however limited it may be...\n" +
                    "You will be given one year; go forth without falter with your heart as your guide...",
                    R.drawable.persona3cover),
            new RPG("Yakuza 7", "Ichiban Kasuga, born and raised in a soapland in Kamurocho \n" +
                    "without ever knowing his real parents. After his life is saved at the age of fiteen by Masumi Arakawa, a yakuza, Kasuga decidates his life to serving the Arakawa Family, " +
                    "until the first day of the 21st century. Kasuga is asked by Arakawa to take the fall for Sawashiro, \n" +
                    "captain of the Arakawa Family, for a murder he had committed. Convinced that the day has come for him to repay Arakawa, \n" +
                    "Kasuga happily obliges and turns himself in to the police.",
                    R.drawable.yakuza7cover)
    };

    private RPG(String name, String description, int imageResourceId) {
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
