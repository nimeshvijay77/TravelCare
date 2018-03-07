package com.example.muj.travelcare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class registration_form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_form_activity);


        //toolbar

        Toolbar mytoolbar = findViewById(R.id.my_toolbar);
        mytoolbar.setTitle("Travel Care");
        setSupportActionBar(mytoolbar);
    }

    // toolbar and dotmenu
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.dotmenu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.id_update:
                return true;

            case R.id.id_set:
                return true;

            case R.id.id_about:
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
