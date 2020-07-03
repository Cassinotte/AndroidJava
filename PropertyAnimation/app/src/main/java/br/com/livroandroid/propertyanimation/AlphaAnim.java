package br.com.livroandroid.propertyanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AlphaAnim extends AppCompatActivity {

    private boolean visivel = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_animacao);
    }

    public void onClickAnimarXML(View view)
    {
        ImageView img = (ImageView) findViewById(R.id.img);
        ObjectAnimator a = (ObjectAnimator) AnimatorInflater.loadAnimator(this,R.anim.fade_out);
        a.setTarget(img);
        animar(a);
    }

    public void onClickAnimarAPI(View view)
    {
        ImageView img = (ImageView) findViewById(R.id.img);
        ObjectAnimator a = ObjectAnimator.ofFloat(img, "alpha", 1f, 0f);

        animar(a);
    }

    private void animar(ObjectAnimator anim)
    {
        anim.setDuration(2000);

        if (visivel)
        {
            anim.start();
        }
        else
        {
            anim.reverse();
        }

        // Inverte o flag na proxima vez utilizar a animação inversa
        visivel = !visivel;
    }
}