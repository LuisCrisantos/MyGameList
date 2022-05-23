package com.hfad.mygamelist;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;


public class RPGDetailFragment extends Fragment {
    private static long rpgId;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            rpgId = savedInstanceState.getLong("rpgId");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            MyGameListDatabaseHelper db = new MyGameListDatabaseHelper(getActivity());
            DbResponse response = db.getRpgData();

            TextView title = (TextView) view.findViewById(R.id.name);
            title.setText(response.name);

            TextView description = (TextView) view.findViewById(R.id.description);
            description.setText(response.description);

            ImageView photo = (ImageView) view.findViewById(R.id.photo);
            photo.setImageResource(response.imageResourceId);

            TextView score = (TextView) view.findViewById(R.id.score);
            score.setText(response.score);

            TextView developers = (TextView) view.findViewById(R.id.developers);
            developers.setText(response.developers);

            TextView publishers = (TextView) view.findViewById(R.id.publishers);
            publishers.setText(response.publishers);

            TextView platforms = (TextView) view.findViewById(R.id.platforms);
            platforms.setText(response.platforms);

            TextView rel_date = (TextView) view.findViewById(R.id.rel_date);
            rel_date.setText(response.rel_date);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putLong("rpgId", rpgId);
    }

    public void setRPG(long id) {
        this.rpgId = id;
    }
    public static long getRpgId() { return rpgId; }
}
