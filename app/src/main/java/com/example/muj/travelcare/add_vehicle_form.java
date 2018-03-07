package com.example.muj.travelcare;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class add_vehicle_form extends AppCompatActivity {
    public android.support.v4.widget.DrawerLayout DrawerLayout2;
    public Button submit_form;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_vehicle_form);




        // clickable part of submit button
        submit_form = (Button) findViewById(R.id.button_submit_info);
        submit_form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(add_vehicle_form.this, homepage_main.class));
                Toast.makeText(add_vehicle_form.this, "submitted",
                        Toast.LENGTH_LONG).show();
            }
        });


        //navigation drawer
        NavigationView mnavigationView =  findViewById(R.id.nav);
        DrawerLayout2 = findViewById(R.id.drawer);
        mnavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                item.setChecked(false);
                DrawerLayout2.closeDrawers();
                return false;
            }
        });

        //toolbar

        Toolbar mytoolbar = findViewById(R.id.my_toolbar);
        mytoolbar.setTitle("Travel Care");
        mytoolbar.setLogo(R.drawable.logo_tc_appbar_smallest);
        setSupportActionBar(mytoolbar);

    }
    // toolbar and dotmenu
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.dotmenu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.id_update:
                return true;

            case R.id.id_set:
                return  true;

            case R.id.id_about:
                return true;

            default:
                return  super.onOptionsItemSelected(item);

        }

    }
}
