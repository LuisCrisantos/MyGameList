package com.hfad.mygamelist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class ActionDetailFragment extends Fragment {
    private long actionId;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            actionId = savedInstanceState.getLong("actionId");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_action_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.name);
            Action action = Action.games[(int) actionId];
            title.setText(action.getName());

            TextView description = (TextView) view.findViewById(R.id.description);
            description.setText(action.getDescription());

            ImageView photo = (ImageView) view.findViewById(R.id.photo);
            photo.setImageResource(action.getImageResourceId());
            photo.setContentDescription(action.getName());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putLong("actionId", actionId);
    }

    public void setAction(long id) {
        this.actionId = id;
    }
}