package com.stamasoft.showrav.animationpractices;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}



        public void imageClicked(View thumbnailView) {
            ImageView thumbnail = (ImageView)thumbnailView;
            ImageView animatedImage = (ImageView) findViewById(R.id.animatedImage);
            animatedImage.setImageDrawable(thumbnail.getDrawable());
            animatedImage.setVisibility(View.VISIBLE);

           // Animation animation = AnimationUtils.loadAnimation(this, R.anim.scale_animation01);

           // Animation animation = AnimationUtils.loadAnimation(this, R.anim.pivot_animation02);

            //Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate_animation03);

          //  Animation animation = AnimationUtils.loadAnimation(this, R.anim.alpha_animation04);

          //  Animation animation = AnimationUtils.loadAnimation(this, R.anim.combination_animation05);

            Animation animation = AnimationUtils.loadAnimation(this, R.anim.sequence_animation06);
            animatedImage.startAnimation(animation);
        }










































    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
