package com.hfad.mygamelist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class ShooterDetailFragment extends Fragment {
    private static long shooterId;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            shooterId = savedInstanceState.getLong("shooterId");
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
            /*TextView title = (TextView) view.findViewById(R.id.name);
            Shooter shooter = Shooter.games[(int) shooterId];
            title.setText(shooter.getName());

            TextView description = (TextView) view.findViewById(R.id.description);
            description.setText(shooter.getDescription());

            ImageView photo = (ImageView) view.findViewById(R.id.photo);
            photo.setImageResource(shooter.getImageResourceId());
            photo.setContentDescription(shooter.getName());

            TextView score = (TextView) view.findViewById(R.id.score);
            score.setText(shooter.getScore());

            TextView developers = (TextView) view.findViewById(R.id.developers);
            developers.setText(shooter.getDevelopers());

            TextView publishers = (TextView) view.findViewById(R.id.publishers);
            publishers.setText(shooter.getPublishers());

            TextView platforms = (TextView) view.findViewById(R.id.platforms);
            platforms.setText(shooter.getPlatforms());

            TextView rel_date = (TextView) view.findViewById(R.id.rel_date);
            rel_date.setText(shooter.getRel_date());*/

            MyGameListDatabaseHelper db = new MyGameListDatabaseHelper(getActivity());
            DbResponse response = db.getShooterData();

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
        savedInstanceState.putLong("shooterId", shooterId);
    }

    public void setShooter(long id) {
        this.shooterId = id;
    }

    public static long getShooterId() { return shooterId; }
}
