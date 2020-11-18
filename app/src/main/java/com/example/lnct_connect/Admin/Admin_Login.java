package com.example.lnct_connect.Admin;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lnct_connect.R;
import com.example.lnct_connect.Common.*;
import com.example.lnct_connect.Faculty.*;
import com.example.lnct_connect.Login.*;
import com.example.lnct_connect.Student.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Admin_Login extends AppCompatActivity {

    Button login3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_admin_login );

        login3 = findViewById( R.id.login3 );

        login3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent add = new Intent( getApplicationContext(), Add.class );
                startActivity( add );
            }
        } );


    }
}