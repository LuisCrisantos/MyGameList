package com.hfad.mygamelist.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.hfad.mygamelist.ActionCategoryActivity;
import com.hfad.mygamelist.R;
import com.hfad.mygamelist.RPGCategoryActivity;
import com.hfad.mygamelist.ShooterCategoryActivity;

public class SearchActivity extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> listView,
                                            View itemView,
                                            int position,
                                            long id) {
                        if (position == 0) {
                            Intent intent = new Intent(SearchActivity.this,
                                    RPGCategoryActivity.class);
                            startActivity(intent);
                        }
                        if (position == 1) {
                            Intent intent = new Intent(SearchActivity.this,
                                    ActionCategoryActivity.class);
                            startActivity(intent);
                        }
                        if (position == 2) {
                            Intent intent = new Intent(SearchActivity.this,
                                    ShooterCategoryActivity.class);
                            startActivity(intent);
                        }
                    }
                };

        ListView listView = (ListView) findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}
