package com.example.muj.travelcare;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

public class MainActivity extends AppCompatActivity {
    public DrawerLayout DrawerLayout;
    // public TextView register; (already decleared below)
    public TextView forgetpassword;
    public CardView login_button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//login button clickable part
        login_button = (CardView) findViewById(R.id.cardView);
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, homepage_main.class));
                Toast.makeText(MainActivity.this, "Logging in .....",
                        Toast.LENGTH_LONG).show();
            }
        });


        //forget password clickable part
        forgetpassword = (TextView) findViewById(R.id.forget_pass);
        forgetpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, forget_password.class));
                Toast.makeText(MainActivity.this, "Enter the register Email-",
                        Toast.LENGTH_LONG).show();
            }
        });


        // register here to signup activity

        TextView register = findViewById(R.id.textView2);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, registration_form.class));
                Toast.makeText(MainActivity.this, "Please fill the form",
                        Toast.LENGTH_LONG).show();
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
