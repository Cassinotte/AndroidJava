package br.com.livroandroid.propertyanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RotateAnim extends AppCompatActivity {

    private boolean flag = true;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_animacao);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void onClickAnimarXML(View view) {
        ImageView img = (ImageView) findViewById(R.id.img);
        ObjectAnimator a = (ObjectAnimator) AnimatorInflater.loadAnimator(this, R.anim.rotate_360);
        a.setTarget(img);
        animar(a);
    }

    public void onClickAnimarAPI(View view) {
        ImageView img = (ImageView) findViewById(R.id.img);
        ObjectAnimator a = ObjectAnimator.ofFloat(img, "rotation", 0, 360);
        animar(a);
    }

    private void animar(ObjectAnimator anim) {
        anim.setDuration(2000);
        if (flag) {
            anim.start();
        } else {
            // Apenas reverte a Animacão
            anim.reverse();
        }
        // Inverte o flag para na próxima vez utilizar a Animacão inversa
        flag = !flag;
    }
}