package br.com.livroandroid.helloactivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import  androidx.appcompat.app.AppCompatActivity;

public class DebugActivity extends AppCompatActivity {

    protected static final String TAG = "livro";

    protected void onCreate(Bundle icicle)
    {
        super.onCreate(icicle);

        Log.i(TAG, getClassName() + ".onCreate() chamado: " + icicle);
    }

    protected void onStart()
    {
        super.onStart();
        Log.i(TAG, getClassName() + ".onRestart() chamado.");
    }

    protected void onRestart()
    {
        super.onRestart();
        Log.i(TAG, getClassName() + ".onRestart() chamado.");
    }

    protected void OnResume()
    {
        super.onResume();
        Log.i(TAG, getClassName() + ".onResumoe() chamado");
    }

    protected void OnPause()
    {
        super.onPause();
        Log.i(TAG, getClassName() + ".onPause() chamado");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        Log.i(TAG, getClassName() + ".onSaveInstanceState() chamado");
    }

    protected void OnStop()
    {
        super.onStop();
        Log.i(TAG, getClassName() + ".onStop() chamado.");
    }

    protected void OnDestroy()
    {
        super.onDestroy();
        Log.i(TAG, getClassName() + ".onDestroy() chamado.");
    }

    private String getClassName() {

        // Retorna o nome da classe sem o pacote
        String s = getClass().getName();
        return s.substring(s.lastIndexOf("."));
    }




}
