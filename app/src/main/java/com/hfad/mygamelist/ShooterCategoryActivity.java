package com.hfad.mygamelist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class ShooterCategoryActivity extends AppCompatActivity implements ShooterListFragment.Listener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shooter_category);
    }

    @Override
    public void itemClicked(long id) {
        View fragmentContainer = findViewById(R.id.fragment_container);
        if (fragmentContainer != null) {
            ShooterDetailFragment details = new ShooterDetailFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            details.setShooter(id);
            ft.replace(R.id.fragment_container, details);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();
        } else {
            Intent intent = new Intent(this, ShooterDetailActivity.class);
            intent.putExtra(ShooterDetailActivity.EXTRA_SHOOTERID, (int)id);
            startActivity(intent);
        }
    }
}