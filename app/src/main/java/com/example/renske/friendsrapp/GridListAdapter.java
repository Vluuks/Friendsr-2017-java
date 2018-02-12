package com.example.renske.friendsrapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Renske on 11/02/2018.
 */

public class GridListAdapter extends ArrayAdapter {

    ArrayList<User> userList;




    public GridListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<User> objects) {
        super(context, resource, objects);

        userList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        ImageView image = convertView.findViewById(R.id.profile_image);
        TextView text = convertView.findViewById(R.id.user_name);

        User currentUser = userList.get(position);
        image.setImageResource(currentUser.getDrawableId());
        text.setText(currentUser.getName());

        return convertView;
    }
}
