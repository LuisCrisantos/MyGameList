package com.hfad.mygamelist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.hfad.mygamelist.Activities.ActionDetailActivity;

public class ActionCategoryActivity extends AppCompatActivity implements ActionListFragment.Listener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_category);
    }

    @Override
    public void itemClicked(long id) {
        View fragmentContainer = findViewById(R.id.fragment_container);
        if (fragmentContainer != null) {
            ActionDetailFragment details = new ActionDetailFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            details.setAction(id);
            ft.replace(R.id.fragment_container, details);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();
        } else {
            Intent intent = new Intent(this, ActionDetailActivity.class);
            intent.putExtra(ActionDetailActivity.EXTRA_ACTIONID, (int)id);
            startActivity(intent);
        }
    }
}