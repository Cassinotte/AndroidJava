 package br.com.livroandroid.demofragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.action_find_frag1_by_id) {
            FragmentManager fm = getSupportFragmentManager();
            Fragment1 f = (Fragment1) fm.findFragmentById(R.id.frag1);
            f.hello();
            return true;
        } else if (id == R.id.action_find_frag2_by_tag) {
            FragmentManager fm = getSupportFragmentManager();
            Fragment2 f = (Fragment2) fm.findFragmentByTag("Fragment2");
            if (f != null) {
                f.hello();
            }
            return true;
        } else if (id == R.id.action_find_frag3_by_tag) {
            FragmentManager fm = getSupportFragmentManager();
            Fragment3 f = (Fragment3) fm.findFragmentByTag("Fragment3");
            if (f != null) {
                f.hello();
            }
            return true;
        } else if (id == R.id.action_add_frag2) {
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction t = fm.beginTransaction();
            Fragment2 f = new Fragment2();
            t.add(R.id.layoutFrag, f, "Fragment2");
            t.addToBackStack(null);
            t.commit();
            return true;
        } else if (id == R.id.action_remove_fragment) {
            FragmentManager fm = getSupportFragmentManager();
            Fragment2 f = (Fragment2) fm.findFragmentByTag("Fragment2");
            if (f != null) {
                FragmentTransaction t = fm.beginTransaction();
                t.remove(f);
                t.commit();
            }
            return true;
        } else if (id == R.id.action_replace_fragment) {
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction t = fm.beginTransaction();
            Fragment3 f = new Fragment3();
            t.replace(R.id.layoutFrag, f, "Fragment3");
            t.addToBackStack(null);

            t.commit();
            return true;
        } else if (id == R.id.action_add_frag4_args) {
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction t = fm.beginTransaction();
            Fragment4 f = new Fragment4();
            Bundle args = new Bundle();
            args.putString("nome", "Ricardo Lecheta");
            f.setArguments(args);
            t.add(R.id.layoutFrag, f, "Fragment4");
            t.addToBackStack(null);
            t.commit();
            return true;
        } else if (id == R.id.action_start_activity) {
            Bundle args = new Bundle();
            args.putString("nome", "Ricardo Lecheta");
            Intent intent = new Intent(this, DemoFragment4Activity.class);
            intent.putExtras(args);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void hello() {
        Toast.makeText(this, "Hello Activity", Toast.LENGTH_SHORT).show();
    }
}