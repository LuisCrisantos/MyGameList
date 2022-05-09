package com.hfad.mygamelist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RPGCategoryActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpg_category);
        ArrayAdapter<RPG> listAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, RPG.games);
        ListView listRPG = (ListView) findViewById(R.id.list_rpg);
        listRPG.setAdapter(listAdapter);
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener(){
                    public void onItemClick(AdapterView<?> listDrinks, View itemView, int position, long id) {
                        Intent intent = new Intent(RPGCategoryActivity.this,
                                RPGActivity.class);
                        intent.putExtra(RPGActivity.EXTRA_RPGID, (int) id);
                        startActivity(intent);
                    }
                };
        listRPG.setOnItemClickListener(itemClickListener);
    }
}
