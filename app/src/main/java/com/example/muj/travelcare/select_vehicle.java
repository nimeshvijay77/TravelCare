package com.example.muj.travelcare;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class select_vehicle extends AppCompatActivity {
    public android.support.v4.widget.DrawerLayout DrawerLayout1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_vehicle);


        //Navigation Drawer
        NavigationView mnavigationView =  findViewById(R.id.nav);
        DrawerLayout1 = findViewById(R.id.drawer);
        mnavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                item.setChecked(false);
                DrawerLayout1.closeDrawers();
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
