package com.venom.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;

public class SuggestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestion);
        RatingBar mBar = (RatingBar) findViewById(R.id.ratingBar);
        mBar.setOnClickListener(onClickRateBar);
    }

    private View.OnClickListener onClickRateBar = new View.OnClickListener() {
        public void onClick(View v) {
            RatingBar bar = (RatingBar) v;
            //bar.getRating()
        }
    };
}
