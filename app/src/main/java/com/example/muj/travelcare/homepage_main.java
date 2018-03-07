package com.example.muj.travelcare;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class homepage_main extends AppCompatActivity {
    public android.support.v4.widget.DrawerLayout DrawerLayout1;
    public Button add_vehicle;
    public TextView mShowDailog;
    public Button select_vehicle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage_main);



        //feedback in homepage  clickable part
        mShowDailog = (TextView) findViewById(R.id.textView_feedback);
        mShowDailog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(homepage_main.this);
                    View mView = getLayoutInflater().inflate(R.layout.feedback_form,null);
                    final EditText mfeedback = (EditText) mView.findViewById(R.id.editText_type_feedback);
                    TextView msubmit = (TextView) mView.findViewById(R.id.textView_submit_feedback);

                    msubmit.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View view){

                            if(!mfeedback.getText().toString().isEmpty()) {
                                Toast.makeText(homepage_main.this, "Thank you for the feedback", Toast.LENGTH_SHORT).show();
                            }


                            else {
                                Toast.makeText(homepage_main.this, "Please enter the feedback", Toast.LENGTH_SHORT).show();

                            }

                        }

                    });
                    mBuilder.setView(mView);
                    AlertDialog dialog = mBuilder.create();
                    dialog.show();
                }
        });



//add vehicle  clickable part
        add_vehicle = (Button) findViewById(R.id.push_button_addvehicle);
        add_vehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(homepage_main.this,add_vehicle_form.class));
                Toast.makeText(homepage_main.this, "fill the form",
                        Toast.LENGTH_LONG).show();
            }
        });


         //select vechile clickable part
        select_vehicle = (Button) findViewById(R.id.button_select_vehicle);
        select_vehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(homepage_main.this,select_vehicle.class));
                Toast.makeText(homepage_main.this, "select vehicle",
                        Toast.LENGTH_LONG).show();
            }
        });

        //navigation drawer
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
