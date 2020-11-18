package com.example.lnct_connect.Admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.lnct_connect.R;

public class Add_Variant extends AppCompatActivity {
    EditText alumniName, alumniEmail, alumniCompany;
    Button Alumni_Submit;
    ImageView cross;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_add__variant );

        alumniName = findViewById( R.id.alumniName );
        alumniCompany = findViewById( R.id.companyName );
        alumniEmail = findViewById( R.id.AlumniEmail );
        Alumni_Submit = findViewById( R.id.AlumniSubmit );
        cross = findViewById( R.id.cancel );

        //on clicking cross button

        cross.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cross = new Intent( getApplicationContext(),Add_Alumni.class );
                startActivity( cross );

            }
        } ) ;



        //on button click
        Alumni_Submit.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty( alumniName.getText().toString().trim() )){
                    alumniName.setError( "Alumni Name cannot be empty" );

                }
               else if (TextUtils.isEmpty( alumniEmail.getText().toString().trim() )){
                    alumniEmail.setError( "Alumni Email cannot be empty" );

                }
                else if (TextUtils.isEmpty( alumniCompany.getText().toString().trim() )){
                    alumniCompany.setError( "Alumni Company cannot be empty" );

                }

                else {
                    //code for submit
                }
            }
        } );






    }
}