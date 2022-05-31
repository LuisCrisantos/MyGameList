package com.hfad.mygamelist;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class InsertGame extends Fragment {
    /*Button button;
    ImageView Photo;
    TextView Name, Description, Score, Devs, Publishers, Platforms, Rel_date;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_detail);*/
        /*View view = inflater.inflate(R.layout.fragment_detail, container, false);

        button = (Button) view.findViewById(R.id.addBtn);

        Name = view.findViewById(R.id.game_name);
        Description = view.findViewById(R.id.description);
        Photo = view.findViewById(R.id.photo);
        Score = view.findViewById(R.id.score);
        Devs = view.findViewById(R.id.developers);
        Publishers = view.findViewById(R.id.publishers);
        Platforms = view.findViewById(R.id.platforms);
        Rel_date = view.findViewById(R.id.rel_date);

        button.setOnClickListener(new View.OnClickListener() {
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
    }*/
}
