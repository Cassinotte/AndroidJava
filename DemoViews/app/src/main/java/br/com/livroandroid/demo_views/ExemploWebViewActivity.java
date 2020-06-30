package br.com.livroandroid.demo_views;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ExemploWebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_web_view);

        final WebView webView = (WebView) findViewById(R.id.webView);

        final View progress = findViewById(R.id.progress);

        progress.setVisibility(View.INVISIBLE);

        webView.loadUrl("https://www.uol.com.br");

        webView.setWebViewClient(new WebViewClient() {

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                progress.setVisibility(View.VISIBLE); // pagina comecou a ser carregada
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                progress.setVisibility(View.INVISIBLE); // pagina foi carregada
            }

            @Override
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                // Erro ao carregar a página do WebView ( endereço errado, ou erro de conexão
            }
        });

    }
}