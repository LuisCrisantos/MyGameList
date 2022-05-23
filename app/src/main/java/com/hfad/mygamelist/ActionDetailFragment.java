package com.hfad.mygamelist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class ActionDetailFragment extends Fragment {
    private static long actionId;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            actionId = savedInstanceState.getLong("actionId");
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
            DbResponse response = db.getActionData();

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
        savedInstanceState.putLong("actionId", actionId);
    }

    public void setAction(long id) {
        this.actionId = id;
    }

    public static long getActionId() { return actionId; }
}
