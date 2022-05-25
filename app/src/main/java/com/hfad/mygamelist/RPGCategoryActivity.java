package com.hfad.mygamelist;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.hfad.mygamelist.Activities.RPGDetailActivity;

public class RPGCategoryActivity extends AppCompatActivity implements RPGListFragment.Listener{
    private SQLiteDatabase db;
    private Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpg_category);
    }

    @Override
    public void itemClicked(long id) {
        View fragmentContainer = findViewById(R.id.fragment_container);
        if (fragmentContainer != null) {
            RPGDetailFragment details = new RPGDetailFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            details.setRPG(id);
            ft.replace(R.id.fragment_container, details);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();
        } else {
            Intent intent = new Intent(this, RPGDetailActivity.class);
            intent.putExtra(RPGDetailActivity.EXTRA_RPGID, (int)id);
            startActivity(intent);
        }
    }
}
