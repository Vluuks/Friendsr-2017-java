package com.example.renske.friendsrapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ArrayList<User> userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create users to populate our app

        User test = new User("bla", "bla", 1, getResources().getIdentifier("tim", "drawable", getPackageName()));

        //userList = new ArrayList<>();
        userList = new ArrayList<User>(Arrays.asList(

                new User("Tim",
                        "hoi ik ben tim ik hou van chips",
                        23,
                        getResources().getIdentifier("tim", "drawable", getPackageName())),

                new User("Renske",
                        "cactussen zijn cool",
                        24,
                        getResources().getIdentifier("renske", "drawable", getPackageName())),

                new User("Martijn",
                        "Ik ben Martijn, a1.20 is echt altijd koud!",
                        35,
                        getResources().getIdentifier("martijn", "drawable", getPackageName())),

                new User("Julia",
                        "oeh moeilijke keus",
                        22,
                        getResources().getIdentifier("julia", "drawable", getPackageName())),

                new User("Marijn",
                        "IK BEN EEN HACKER",
                        25,
                        getResources().getIdentifier("marijn", "drawable", getPackageName())),

                new User("Emma",
                        "WOEHOE",
                        22,
                        getResources().getIdentifier("emma", "drawable", getPackageName())),

                new User("Mirja",
                        "WOEHOE",
                        22,
                        getResources().getIdentifier("mirja", "drawable", getPackageName())),

                new User("Quinten",
                        "WOEHOE",
                        22,
                        getResources().getIdentifier("quinten", "drawable", getPackageName())),

                new User("Sascha",
                        "WOEHOE",
                        22,
                        getResources().getIdentifier("sascha", "drawable", getPackageName())),

                new User("Simon",
                        "WOEHOE",
                        22,
                        getResources().getIdentifier("simon", "drawable", getPackageName())),

                new User("Wouter",
                        "ja",
                        22,
                        getResources().getIdentifier("wouter", "drawable", getPackageName()))

        ));

        // set adapter and shit
        setGridView();

    }

    public void setGridView() {
        GridView gridView = findViewById(R.id.grid_view);
        ArrayAdapter<User> adapter = new GridListAdapter(this, R.layout.list_item, userList);
        gridView.setAdapter(adapter);

        AdapterView.OnItemClickListener listener = new OnItemClickListenerGrid();
        gridView.setOnItemClickListener(listener);
    }

    private class OnItemClickListenerGrid implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Log.d("YO", "klinkerdieklink");
        }
    }
}
