package br.com.livroandroid.demo_layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import android.widget.LinearLayout;

public class ExemploScrollViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_exemplo_scroll_view);

        LinearLayout layout = (LinearLayout) findViewById(R.id.layout1);

        for (int i = 0; i < 100; i++)
        {
            // Instancia o TextView inflando o arquivo de layout
            LayoutInflater inflater = LayoutInflater.from(this);
            TextView text = (TextView) inflater.inflate(R.layout.inflate_textview, layout, false);

            // Instancia o TextView pela API
			//TextView text = new TextView(this);
			//text.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));

            text.setText("Texto: " + i);
            layout.addView(text);
        }

    }
}