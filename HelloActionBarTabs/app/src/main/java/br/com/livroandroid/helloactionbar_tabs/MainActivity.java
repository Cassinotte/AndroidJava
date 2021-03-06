package br.com.livroandroid.helloactionbar_tabs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.core.view.MenuItemCompat;

import androidx.appcompat.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidx.appcompat.app.ActionBar actionBar = getSupportActionBar();

        actionBar.setTitle("Capitulo 5");
        // Configura a action bar para utilizar as tabs

        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        // Cria as tabs ( Passa com parametro o indice de cada tab: 1, 2, 3 )
        actionBar.addTab(actionBar.newTab().setText("Tab 1")
                .setTabListener(new MyTabListener(this, 1)));

        actionBar.addTab(actionBar.newTab().setText("Tab 2")
                .setTabListener(new MyTabListener(this, 2)));

        actionBar.addTab(actionBar.newTab().setText("Tab 3")
                .setTabListener(new MyTabListener(this, 3)));


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Infla o menu com os botões da action bar
        getMenuInflater().inflate(R.menu.menu_main, menu);

        // SearchView
        MenuItem item = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(onSearch());

        // ShareActionProvider
        MenuItem shareItem = menu.findItem(R.id.action_share);
        ShareActionProvider share = (ShareActionProvider) MenuItemCompat.getActionProvider(shareItem);
        share.setShareIntent(getDefaultIntent());

        return true;
    }

    // Intent que define o conteúdo que será compartilhado
    private Intent getDefaultIntent() {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/*");
        intent.putExtra(Intent.EXTRA_TEXT, "Texto para compartilhar");
        return intent;
    }

    private SearchView.OnQueryTextListener onSearch() {
        return new SearchView.OnQueryTextListener(){
            @Override
            public boolean onQueryTextSubmit(String query) {
                toast("Buscar o texto: " + query);
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        };
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_search) {
            toast("Clicou no Search!");
            return true;
        } else if (id == R.id.action_refresh) {
            toast("Clicou no Refresh!");
            return true;
        } else if (id == R.id.action_settings) {
            toast("Clicou no Settings!");
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    private void toast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}