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
        User testMartijn = new User("Martijn",
                                "Ik ben Martijn, a1.20 is echt altijd koud!",
                                35,
                                    getResources().getIdentifier("martijn", "drawable", getPackageName())
        );
        User testJulia = new User("Julia",
                "oeh moeilijke keus",
                22,
                getResources().getIdentifier("julia", "drawable", getPackageName())
        );
        User testMarijn = new User("Marijn",
                "IK BEN EEN HACKER",
                22,
                getResources().getIdentifier("marijn", "drawable", getPackageName())
        );


        // add 5 tims for the test
        userList.add(testTim);
        userList.add(testMartijn);
        userList.add(testJulia);
        userList.add(testMarijn);
        userList.add(testTim);
        userList.add(testMartijn);
        userList.add(testJulia);
        userList.add(testMarijn);
        userList.add(testTim);
        userList.add(testMartijn);
        userList.add(testJulia);
        userList.add(testMarijn);

        // set adapter and shit
        setGridView();

    }

    public void setGridView(){

        GridView gridView = findViewById(R.id.grid_view);
        ArrayAdapter<User> adapter = new GridListAdapter(this, R.layout.list_item, userList);
        gridView.setAdapter(adapter);
    }
}
