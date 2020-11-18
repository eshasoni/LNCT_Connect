package com.example.lnct_connect.Faculty;

import androidx.appcompat.app.AppCompatActivity;
import com.example.lnct_connect.Student.*;
import com.example.lnct_connect.Login.*;
import com.example.lnct_connect.Admin.*;
import com.example.lnct_connect.Common.*;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.lnct_connect.R;

public class Faculty_Login extends AppCompatActivity {
    Button login1;
    EditText faculty_Id, faculty_Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_faculty__login );

        login1 = findViewById( R.id.log1 );
        faculty_Id = findViewById( R.id.facultyid );
        faculty_Password = findViewById( R.id.facultypassword );

        //on button click
        login1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty( faculty_Id.getText().toString().trim() )){
                    faculty_Id.setError( "Unique id cannot be empty" );
                }
                else if (TextUtils.isEmpty( faculty_Password.getText().toString().trim() )){
                    faculty_Password.setError( "Password cannot be empty" );

                }
                else{

                    Intent second = new Intent(getApplicationContext(), Home.class);
                    startActivity( second );
                }


            }
        } );
    }
}