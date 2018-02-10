package com.cris.ukulele;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView mIcon;
    TextView mArtist;
    TextView mSongTitle;
    TextView mSongDetails;
    ImageView mFavorite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.cris.ukulele.R.layout.activity_detail);

        mIcon = findViewById(com.cris.ukulele.R.id.tvIcon);
        mArtist = findViewById(com.cris.ukulele.R.id.tvArtist);
        mSongTitle = findViewById(com.cris.ukulele.R.id.tvSongTitle);
        mSongDetails = findViewById(com.cris.ukulele.R.id.tvSongDetails);
        mFavorite = findViewById(com.cris.ukulele.R.id.ivFavorite);

        Bundle mBundle = getIntent().getExtras();
        if (mBundle != null) {
            mIcon.setText(mBundle.getString("icon"));
            ((GradientDrawable) mIcon.getBackground()).setColor(mBundle.getInt("colorIcon"));
            mArtist.setText(mBundle.getString("sender"));
            mSongTitle.setText(mBundle.getString("title"));
            mSongDetails.setText(mBundle.getString("details"));
        }
        mFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mFavorite.getColorFilter() != null) {
                    mFavorite.clearColorFilter();
                } else {
                    mFavorite.setColorFilter(ContextCompat.getColor(DetailActivity.this,
                            com.cris.ukulele.R.color.colorOrange));
                }
            }
        });
    }
}
