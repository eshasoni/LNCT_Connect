package com.example.lnct_connect.Student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.lnct_connect.Faculty.*;
import com.example.lnct_connect.Login.*;
import com.example.lnct_connect.Admin.*;
import com.example.lnct_connect.Common.*;

import com.example.lnct_connect.R;

public class Student_Login extends AppCompatActivity {
    Button login;
    EditText student_Id , student_Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_student__login );
        login = findViewById( R.id.log);
        student_Id = findViewById( R.id.studentid );
        student_Password = findViewById( R.id.studentpassword );

        //On login button click
        login.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(student_Id.getText().toString().trim())){
                    student_Id.setError( "Unique id cannot be empty" );
                }
                else if(TextUtils.isEmpty( student_Password.getText().toString().trim() )){
                    student_Password.setError( "Password cannot be empty" );
                }
                else {
                    Intent next = new Intent( getApplicationContext(), HomeActivity.class   );
                    startActivity( next );
                }


            }
        } );


    }
}