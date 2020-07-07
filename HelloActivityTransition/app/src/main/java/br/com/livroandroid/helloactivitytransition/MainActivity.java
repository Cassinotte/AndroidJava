package br.com.livroandroid.helloactivitytransition;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickPlaneta(View view)
    {
        Intent intent = new Intent(getBaseContext(), PlanetaActivity.class);

        ActivityOptionsCompat opts =
                ActivityOptionsCompat.makeCustomAnimation(this, R.anim.fade_in, R.anim.fade_out);

        ActivityCompat.startActivity(this, intent, opts.toBundle());
    }
}