package com.hfad.mygamelist;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;


public class RPGDetailFragment extends Fragment{
    private static long rpgId;
    Button addGames;
    ImageView Photo;
    TextView Name, Foto, Description, Score, Devs, Publishers, Platforms, Rel_date;
    OnDbOpListener dbOpListener;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            rpgId = savedInstanceState.getLong("rpgId");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);

        addGames = (Button) view.findViewById(R.id.addBtn);

        Name = view.findViewById(R.id.name);
        Description = view.findViewById(R.id.description);
        Photo = view.findViewById(R.id.photo);
        Score = view.findViewById(R.id.score);
        Devs = view.findViewById(R.id.developers);
        Publishers = view.findViewById(R.id.publishers);
        Platforms = view.findViewById(R.id.platforms);
        Rel_date = view.findViewById(R.id.rel_date);

        addGames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = Name.getText().toString();
                String description = Description.getText().toString();
                int photo = Photo.getId();
                String score = Score.getText().toString();
                String devs = Devs.getText().toString();
                String publishers = Publishers.getText().toString();
                String platforms = Platforms.getText().toString();
                String rel_date = Rel_date.getText().toString();

                MyGameListDatabaseHelper mygamelist = new MyGameListDatabaseHelper(getActivity());
                SQLiteDatabase db = mygamelist.getWritableDatabase();
                mygamelist.addGame(name, description, photo, score, devs, publishers, platforms, rel_date, db);
                mygamelist.close();
                Toast.makeText(getActivity(),"Success!",Toast.LENGTH_SHORT).show();
            }
        });
         return view;
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

    public interface OnDbOpListener{
        public void dbOpPerformed(int method);
    }

    public void setRPG(long id) {
        this.rpgId = id;
    }
    public static long getRpgId() { return rpgId; }


}
