package com.hfad.mygamelist;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyGameListDatabaseHelper  extends SQLiteOpenHelper {

    private static final String DB_NAME = "mygamelist";
    private static final int DB_VERSION = 2;

    MyGameListDatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        updateMyDatabase(db, 0, DB_VERSION);
    }

    private static void insertRPG(SQLiteDatabase db, String name, String description, String score, String developers, String publishers, String platforms, String rel_date, int resourceId) {
        ContentValues rpgValues = new ContentValues();
        rpgValues.put("NAME", name);
        rpgValues.put("DESCRIPTION", description);
        rpgValues.put("SCORE", score);
        rpgValues.put("DEVELOPERS", developers);
        rpgValues.put("PUBLISHERS", publishers);
        rpgValues.put("PLATFORMS", platforms);
        rpgValues.put("REL_DATE", rel_date);
        rpgValues.put("IMAGE_RESOURCE_ID", resourceId);
        db.insert("RPG", null, rpgValues);
    }

    private static void insertAction(SQLiteDatabase db, String name, String description, String score, String developers, String publishers, String platforms, String rel_date, int resourceId) {
        ContentValues actionValues = new ContentValues();
        actionValues.put("NAME", name);
        actionValues.put("DESCRIPTION", description);
        actionValues.put("SCORE", score);
        actionValues.put("DEVELOPERS", developers);
        actionValues.put("PUBLISHERS", publishers);
        actionValues.put("PLATFORMS", platforms);
        actionValues.put("REL_DATE", rel_date);
        actionValues.put("IMAGE_RESOURCE_ID", resourceId);
        db.insert("ACTIONS", null, actionValues);
    }

    private static void insertShooter(SQLiteDatabase db, String name, String description, String score, String developers, String publishers, String platforms, String rel_date, int resourceId) {
        ContentValues shooterValues = new ContentValues();
        shooterValues.put("NAME", name);
        shooterValues.put("DESCRIPTION", description);
        shooterValues.put("SCORE", score);
        shooterValues.put("DEVELOPERS", developers);
        shooterValues.put("PUBLISHERS", publishers);
        shooterValues.put("PLATFORMS", platforms);
        shooterValues.put("REL_DATE", rel_date);
        shooterValues.put("IMAGE_RESOURCE_ID", resourceId);
        db.insert("SHOOTER", null, shooterValues);
    }

    private void updateMyDatabase(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion < 1) {
            db.execSQL("CREATE TABLE RPG ("
                    + "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + "NAME TEXT, "
                    + "DESCRIPTION TEXT, "
                    + "SCORE TEXT,"
                    + "DEVELOPERS TEXT,"
                    + "PUBLISHERS TEXT,"
                    + "PLATFORMS TEXT,"
                    + "REL_DATE TEXT,"
                    + "IMAGE_RESOURCE_ID INTEGER);");

            db.execSQL("CREATE TABLE ACTIONS ("
                    + "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + "NAME TEXT, "
                    + "DESCRIPTION TEXT, "
                    + "SCORE TEXT,"
                    + "DEVELOPERS TEXT,"
                    + "PUBLISHERS TEXT,"
                    + "PLATFORMS TEXT,"
                    + "REL_DATE TEXT,"
                    + "IMAGE_RESOURCE_ID INTEGER);");

            db.execSQL("CREATE TABLE SHOOTER ("
                    + "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + "NAME TEXT, "
                    + "DESCRIPTION TEXT, "
                    + "SCORE TEXT,"
                    + "DEVELOPERS TEXT,"
                    + "PUBLISHERS TEXT,"
                    + "PLATFORMS TEXT,"
                    + "REL_DATE TEXT,"
                    + "IMAGE_RESOURCE_ID INTEGER);");

            insertRPG(db, "Xenoblade Chronicles Definitive Edition", "Long ago, the world was nothing more than an endless sea " +
                            "cloaked in a boundless sky, reaching as far as could possibly be imagined.\n"+
                            "Then two great titans came into existence: the Bionis and the Mechonis. " +
                            "The titans were locked in a timeless battle. Until at last...\n" +
                            "Only their lifeless corpses remained.\n"+"Eons have passed. Now our world, " +
                            "this vast land stretching across the remains of the Bionis, is under attack from a relentless force known as the Mechon.",
                    "9.9", "Monolithsoft", "Nintendo", "Nintendo Switch", "29/05/2020", R.drawable.xenobladecover);

            insertRPG(db,"Persona 3 FES", "Time never waits.\n" +
                            "It delivers all equally to the same end.\n" +
                            "You, who wish to safeguard the future, however limited it may be...\n" +
                            "You will be given one year; go forth without falter with your heart as your guide...",
                    "9.7", "Atlus", "Sony", "PS2", "22/04/2008",R.drawable.persona3cover);

            insertRPG(db, "Yakuza Like a Dragon", "Ichiban Kasuga, born and raised in a soapland in Kamurocho " +
                            "without ever knowing his real parents. After his life is saved at the age of fiteen by Masumi Arakawa, " +
                            "a yakuza, Kasuga decidates his life to serving the Arakawa Family, until the first day of the 21st century. " +
                            "Kasuga is asked by Arakawa to take the fall for Sawashiro, captain of the Arakawa Family, for a murder he had committed. " +
                            "Convinced that the day has come for him to repay Arakawa, Kasuga happily obliges and turns himself in to the police.",
                    "9.5", "Ryu ga Gotoku Studio", "Sega", "PS4, PS5, Xbox One, \nXbox Series X/S, PC", "16/01/2020",R.drawable.yakuza7cover);


            insertAction(db, "Yakuza 0", "In December, 1988, two unlikely figures from the Yakuza world, " +
                            "Kazuma Kiryu of the Kanto region and Goro Majima of the Kansai Region, have suddenly found themselves " +
                            "getting involved in the terrible events of the so-called \"Empty Lot\" dispute, which is the centrepiece " +
                            "of power struggle for all the dark organizations across Japan. In order to find out the truth behind such " +
                            "a power struggle, as well as maintain their own innocence and safety, they set out to investigate all the events surrounding the \"Empty Lot\" incident.",
                    "9.7", "Ryu ga Gotoku Studio", "Sega", "PS3, PS4, Xbox One, PC", "12/03/2015", R.drawable.yakuza0cover);

            insertAction(db,"The Legend of Zelda Breath of the Wild", "Link awakens from his slumber in the " +
                            "Shrine of Resurrection to a mysterious voice, not knowing who or where he is. Finding a strange device nearby, " +
                            "the Sheikah Slate once used by Princess Zelda herself, he walks out onto the Great Plateau to meet an Old Man.\n" +
                            "The old man, believing that Link's fragile memory is now ready to be regaled with the story of Hyrule's demise, " +
                            "then tells Link that he is actually the spirit of King Rhoam from 100 years ago. He details the events of his kingdom's " +
                            "fall, including the discovery of the ancient relics, return of Calamity Ganon, and fact that Link is the revitalized knight" +
                            " who valiantly fell in battle defending the princess. He tells Link that Princess Zelda is the one who has been calling out to him," +
                            " and that she has been gradually losing her power to contain Ganon within the castle. He warns that soon Zelda's power will be exhausted," +
                            " after which Ganon will be free to regenerate and consume the land of Hyrule unopposed.\n" +
                            "Link sets out on his journey to regain his memories and re-harness the control and support of the Divine Beasts in his new quest to defeat Ganon.",
                    "9.9", "Nintendo EPD", "Nintendo", "Nintendo Switch", "03/03/2017", R.drawable.botwcover);

            insertAction(db, "Persona 5 Strikers", "After a few months after the events ofn Persona 5, its group of protagonists meet again" +
                            " to enjoy their well-deserved summer vacations and disconnect for a few days from their student life. However, " +
                            "it doesn't take long for things to go wrong when they discover that a new threat is once again looming over the " +
                            "Metaverse and the real world, which ends up leading to a road trip across Japan that will take them to visit some " +
                            "of its most interesting cities and locations. iconic, but also to explore all kinds of dungeons and face " +
                            "multitudes of Shadows who will not hesitate to stand in their way.",
                    "8.8", "Atlus, Koei Techmo", "Sega", "Nintendo Switch, PS4, PC", "20/02/2020", R.drawable.p5scover);


            insertShooter(db, "Kid Icarus Uprising", "25 years after the original Kid Icarus, Medusa has been resurrected " +
                            "and once again attempts to eradicate mankind while seeking revenge on Pit and Palutena. Upon learning this, " +
                            "Palutena summons Pit to stop the Underworld Army and bring peace to their realm once more.",
                    "9.9", "Project Sora", "Nintendo", "Nintendo 3DS", "22/03/2012", R.drawable.kidicaruscover);

            insertShooter(db,"Metroid Prime", "The game takes place on the planet Tallon IV, formerly inhabited by the Chozo race." +
                            "Five decades ago, the Chozo race fell after a meteor impacted on Tallon IV. The meteor contaminated the planet with a corruptive," +
                            " mutagenic substance that the Space Pirates later named Phazon, and also brought with it a creature known to the Chozo " +
                            "as \"The Worm\". A large containment field emitter of the Artifact Temple in the Tallon Overworld area was built as a seal to " +
                            "the meteor's energies and influence within the crater where it landed, which the Space Pirates attempt to disable or bypass in " +
                            "order to gain better access to extract the Phazon. The containment field is controlled by twelve Chozo artifacts that are scattered around the planet.",
                    "9.5", "Retro Studios", "Nintendo", "Nintendo Gamecube", "18/11/2002", R.drawable.metroidprimecover);

            insertShooter(db, "Paladins", "In the world of Paladins, there is a conflict between two factions; the Magistrate and the Resistance/Paladins." +
                            " While the Magistrate wants to control magic, preventing anyone but its members to use it, the Resistance claims that magic should be available" +
                            " for everyone and used for good. Champions were recruited in order to minimize casualties of regular foot soldiers. The champions would be considered" +
                            " \"special forces\" as they are more efficient at combat than a regular soldier. Not all champions are committed, however. There were a few who did" +
                            " not pick sides during the war, rather they would contract with both, rendering them mercenaries. The rest of these special forces were committed " +
                            "to a faction, either the Magistrate or the Resistance.",
                    "7.8", "Evil Mojo Games", "Hi-Rez Studios", "Nintendo Switch, PS4, Xbox One, PC", "08/05/2018", R.drawable.paladinscover);



        }
        if (oldVersion < 2) {
            db.execSQL("ALTER TABLE RPG ADD COLUMN FAVORITE NUMERIC;");
            db.execSQL("ALTER TABLE ACTIONS ADD COLUMN FAVORITE NUMERIC;");
            db.execSQL("ALTER TABLE SHOOTER ADD COLUMN FAVORITE NUMERIC;");
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + "RPG");
        this.onCreate(db);
    }

    public DbResponse getRpgData(){
        DbResponse obj = new DbResponse();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.query("RPG",
                new String[]{"NAME", "DESCRIPTION", "SCORE", "DEVELOPERS", "PUBLISHERS", "PLATFORMS", "REL_DATE", "IMAGE_RESOURCE_ID"},
                "_id = ?",
                new String[]{Integer.toString((int) RPGDetailFragment.getRpgId() + 1 )},
                null, null, null);
        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            obj.name = cursor.getString(0);
            obj.description = cursor.getString(1);
            obj.score = cursor.getString(2);
            obj.developers = cursor.getString(3);
            obj.publishers = cursor.getString(4);
            obj.platforms = cursor.getString(5);
            obj.rel_date = cursor.getString(6);
            obj.imageResourceId = cursor.getInt(7);

        }
        cursor.close();
        return obj;
    }

    public DbResponse getActionData(){
        DbResponse obj = new DbResponse();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.query("ACTIONS",
                new String[]{"NAME", "DESCRIPTION", "SCORE", "DEVELOPERS", "PUBLISHERS", "PLATFORMS", "REL_DATE", "IMAGE_RESOURCE_ID"},
                "_id = ?",
                new String[]{Integer.toString((int) ActionDetailFragment.getActionId() + 1 )},
                null, null, null);
        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            obj.name = cursor.getString(0);
            obj.description = cursor.getString(1);
            obj.score = cursor.getString(2);
            obj.developers = cursor.getString(3);
            obj.publishers = cursor.getString(4);
            obj.platforms = cursor.getString(5);
            obj.rel_date = cursor.getString(6);
            obj.imageResourceId = cursor.getInt(7);

        }
        cursor.close();
        return obj;
    }

    public DbResponse getShooterData(){
        DbResponse obj = new DbResponse();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.query("SHOOTER",
                new String[]{"NAME", "DESCRIPTION", "SCORE", "DEVELOPERS", "PUBLISHERS", "PLATFORMS", "REL_DATE", "IMAGE_RESOURCE_ID"},
                "_id = ?",
                new String[]{Integer.toString((int) ShooterDetailFragment.getShooterId() + 1 )},
                null, null, null);
        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            obj.name = cursor.getString(0);
            obj.description = cursor.getString(1);
            obj.score = cursor.getString(2);
            obj.developers = cursor.getString(3);
            obj.publishers = cursor.getString(4);
            obj.platforms = cursor.getString(5);
            obj.rel_date = cursor.getString(6);
            obj.imageResourceId = cursor.getInt(7);

        }
        cursor.close();
        return obj;
    }
}