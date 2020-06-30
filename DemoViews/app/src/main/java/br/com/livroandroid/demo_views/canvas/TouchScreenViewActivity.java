package br.com.livroandroid.demo_views.canvas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Toast;

public class TouchScreenViewActivity extends AppCompatActivity {

    private static final String CATEGORIA = "livro";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(new TouchScreenView(this));

        Toast.makeText(this, "Mova o objeto com o touch", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i(CATEGORIA, "TouchScreenViewActivity.onTouchEvent");
        return super.onTouchEvent(event);
    }
}