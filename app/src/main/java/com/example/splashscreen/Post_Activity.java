package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Toast;

public class Post_Activity extends AppCompatActivity {
ImageView love , star , share;
boolean React_Love;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_);
        star = findViewById(R.id.star);
        final RatingBar ratingBar= findViewById(R.id.ratingBar);
        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rating = "Rating is: "+ratingBar.getRating();
                Toast.makeText(Post_Activity.this,rating, Toast.LENGTH_SHORT).show();
            }
        });
        love = findViewById(R.id.favorite);
        love.setImageResource(isLove() ?R.drawable.ic_favorite_red_24:R.drawable.ic_favorite_shdow_24);
        love.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (React_Love == false){
                    setLove(!isLove());
                    love.setImageResource(isLove() ?R.drawable.ic_favorite_red_24:R.drawable.ic_favorite_shdow_24);

                }else
                    setLove(!isLove());
                love.setImageResource(isLove() ?R.drawable.ic_favorite_shdow_24:R.drawable.ic_favorite_red_24);

            }
        });

    }
    public boolean isLove(){
        return React_Love;
    }

    public void setLove(boolean love) {
        React_Love = love;
    }
}