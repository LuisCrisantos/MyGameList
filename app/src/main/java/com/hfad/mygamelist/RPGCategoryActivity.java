package com.hfad.mygamelist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class RPGCategoryActivity extends AppCompatActivity implements RPGListFragment.Listener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpg_category);
        /*ArrayAdapter<RPG> listAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, RPG.games);
        ListView listRPG = (ListView) findViewById(R.id.rpg_list_frag);
        listRPG.setAdapter(listAdapter);
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener(){
                    public void onItemClick(AdapterView<?> listGames, View itemView, int position, long id) {
                        Intent intent = new Intent(RPGCategoryActivity.this,
                                RPGDetailActivity.class);
                        intent.putExtra(RPGDetailActivity.EXTRA_RPGID, (int) id);
                        startActivity(intent);
                    }
                };
        listRPG.setOnItemClickListener(itemClickListener);*/
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
