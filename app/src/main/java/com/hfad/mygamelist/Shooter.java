package com.hfad.mygamelist;

public class Shooter {
    private String name;
    private String description;
    private String score;
    private String developers;
    private String publishers;
    private String platforms;
    private String rel_date;
    private int imageResourceId;

    public static final Shooter[] games = {
            new Shooter("Kid Icarus Uprising", "25 years after the original Kid Icarus, Medusa has been resurrected " +
                    "and once again attempts to eradicate mankind while seeking revenge on Pit and Palutena. Upon learning this, " +
                    "Palutena summons Pit to stop the Underworld Army and bring peace to their realm once more.",
                    "9.9", "Project Sora", "Nintendo", "Nintendo 3DS", "22/03/2012", R.drawable.kidicaruscover),

            new Shooter("Metroid Prime", "The game takes place on the planet Tallon IV, formerly inhabited by the Chozo race." +
                    "Five decades ago, the Chozo race fell after a meteor impacted on Tallon IV. The meteor contaminated the planet with a corruptive," +
                    " mutagenic substance that the Space Pirates later named Phazon, and also brought with it a creature known to the Chozo " +
                    "as \"The Worm\". A large containment field emitter of the Artifact Temple in the Tallon Overworld area was built as a seal to " +
                    "the meteor's energies and influence within the crater where it landed, which the Space Pirates attempt to disable or bypass in " +
                    "order to gain better access to extract the Phazon. The containment field is controlled by twelve Chozo artifacts that are scattered around the planet.",
                    "9.5", "Retro Studios", "Nintendo", "Nintendo Gamecube", "18/11/2002", R.drawable.metroidprimecover),

            new Shooter("Paladins", "In the world of Paladins, there is a conflict between two factions; the Magistrate and the Resistance/Paladins." +
                    " While the Magistrate wants to control magic, preventing anyone but its members to use it, the Resistance claims that magic should be available" +
                    " for everyone and used for good. Champions were recruited in order to minimize casualties of regular foot soldiers. The champions would be considered" +
                    " \"special forces\" as they are more efficient at combat than a regular soldier. Not all champions are committed, however. There were a few who did" +
                    " not pick sides during the war, rather they would contract with both, rendering them mercenaries. The rest of these special forces were committed " +
                    "to a faction, either the Magistrate or the Resistance.",
                    "7.8", "Evil Mojo Games", "Hi-Rez Studios", "Nintendo Switch, PS4, Xbox One, PC", "08/05/2018", R.drawable.paladinscover)
    };

    private Shooter(String name, String description, String score, String developers, String publishers, String platforms, String rel_date, int imageResourceId) {
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