package br.com.livroandroid.hellomaterial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;

public class ExemploElevationActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_elevation);

        button = (Button) findViewById(R.id.button);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        seekBar = (SeekBar) findViewById(R.id.seekBar);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                //button.setElevation(progress);
                ViewCompat.setElevation(button, progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }
}