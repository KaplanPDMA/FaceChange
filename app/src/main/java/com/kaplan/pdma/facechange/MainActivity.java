package com.kaplan.pdma.facechange;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ImageView;

import com.github.pwittchen.swipe.library.Swipe;
import com.github.pwittchen.swipe.library.SwipeListener;

public class MainActivity extends AppCompatActivity {

    private Swipe swipe;

    @Override public boolean dispatchTouchEvent(MotionEvent event) {
        swipe.dispatchTouchEvent(event);
        return super.dispatchTouchEvent(event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView face = (ImageView) findViewById(R.id.imageView);

        swipe = new Swipe();
        swipe.addListener(new SwipeListener() {
            @Override
            public void onSwipingLeft(MotionEvent event) {

            }

            @Override
            public void onSwipedLeft(MotionEvent event) {
                face.setImageResource(R.drawable.face3);
            }

            @Override
            public void onSwipedRight(MotionEvent event) {
                face.setImageResource(R.drawable.face4);
            }

            @Override
            public void onSwipedUp(MotionEvent event) {
                face.setImageResource(R.drawable.face1);
            }

            @Override
            public void onSwipedDown(MotionEvent event) {
                face.setImageResource(R.drawable.face2);
            }


            @Override
            public void onSwipingRight(MotionEvent event) {

            }



            @Override
            public void onSwipingUp(MotionEvent event) {

            }



            @Override
            public void onSwipingDown(MotionEvent event) {

            }


        });

    }
}
