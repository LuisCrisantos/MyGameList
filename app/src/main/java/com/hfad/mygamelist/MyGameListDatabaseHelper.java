package com.hfad.mygamelist;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyGameListDatabaseHelper  extends SQLiteOpenHelper {

    private static final String DB_NAME = "mygamelist";
    private static final int DB_VERSION = 1;

    MyGameListDatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
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

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}