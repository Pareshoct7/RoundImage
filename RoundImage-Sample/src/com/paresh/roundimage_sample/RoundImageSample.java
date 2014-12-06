package com.paresh.roundimage_sample;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;

import com.paresh.RoundImage;

public class RoundImageSample extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_round_image);

		ImageView img1 = (ImageView) findViewById(R.id.img1);
		ImageView img2 = (ImageView) findViewById(R.id.img2);

		// Drawable d = getResources().getDrawable(R.drawable.santa);

		Bitmap wallpaper = ((BitmapDrawable) getWallpaper()).getBitmap();

		Drawable drawable = RoundImage.getRoundDrawable(getWallpaper());
		Bitmap bitmap = RoundImage.getRoundBitmap(wallpaper);

		img1.setImageDrawable(drawable);
		img2.setImageBitmap(bitmap);
	}
}
