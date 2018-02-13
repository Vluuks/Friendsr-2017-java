package com.example.renske.friendsrapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Rating;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    User currentUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Intent intent = getIntent();
        if(intent != null) {

            currentUser = (User) intent.getSerializableExtra("User");
            updateUI();
        }

        RatingBar bar = findViewById(R.id.rating_bar);
        bar.setOnRatingBarChangeListener(new MyRatingBarClickListener());
    }

    public void updateUI() {

        ImageView profilePicture = findViewById(R.id.picture_profile);
        profilePicture.setImageResource(currentUser.getDrawableId());

        TextView userName = findViewById(R.id.user_name_profile);
        userName.setText(currentUser.getName());

        TextView bioQuote = findViewById(R.id.user_bio_profile);
        bioQuote.setText(currentUser.getBio());

        RatingBar ratingBar = findViewById(R.id.rating_bar);

        // Get stored rating.
        SharedPreferences prefs = getSharedPreferences("settings", MODE_PRIVATE);
        Float storedRating = prefs.getFloat(currentUser.getName(), -1);
        if(storedRating != -1) {
            ratingBar.setRating(storedRating);
        }
    }

    private class MyRatingBarClickListener implements RatingBar.OnRatingBarChangeListener {
        @Override
        public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
            Log.d("test", "de rating is veranderd");


            if(currentUser != null) {
                SharedPreferences prefs = getSharedPreferences("settings", MODE_PRIVATE);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putFloat(currentUser.getName(), ratingBar.getRating());
                editor.apply();
            }

        }
    }
}