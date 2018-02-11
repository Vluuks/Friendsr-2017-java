package com.example.renske.friendsrapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<User> userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create users to populate our app

        userList = new ArrayList<>();

        User testTim = new User("Tim",
                                "hoi ik ben tim ik hou van chips",
                                23,
                                getResources().getIdentifier("tim", "drawable", getPackageName())
        );

        // add 5 tims for the test
        userList.add(testTim);
        userList.add(testTim);
        userList.add(testTim);
        userList.add(testTim);
        userList.add(testTim);


        // set adapter and shit
        setGridView();

    }

    public void setGridView(){

        GridView gridView = findViewById(R.id.grid_view);
        ArrayAdapter<User> adapter = new GridListAdapter(this, R.layout.list_item, userList);
        gridView.setAdapter(adapter);
    }
}
