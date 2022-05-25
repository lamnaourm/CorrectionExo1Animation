package com.example.correctionexo1animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView im;
    EditText e1, e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        im = findViewById(R.id.imge);
        e1 = findViewById(R.id.angledepart);
        e2 = findViewById(R.id.anglearrivee);

    }

    public void animer(View view) {
        int a1 = Integer.valueOf(e1.getText().toString());
        int a2 = Integer.valueOf(e2.getText().toString());
        RotateAnimation anim = new RotateAnimation(a1,a2, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        anim.setDuration(5000);
        anim.setFillAfter(true);

        im.startAnimation(anim);
    }
}