package com.example.sowmya.firebase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class StoreRegisterActivity extends AppCompatActivity {
    EditText email,password,name_of_store;
    Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_register);
        email=(EditText)findViewById(R.id.editText2);
        password=(EditText)findViewById(R.id.editText3);
        name_of_store=(EditText)findViewById(R.id.editText4);
        signup=(Button)findViewById(R.id.button3);

        //Code for authentication and storing in firebase
        Intent intent=new Intent(StoreRegisterActivity.this,UpdateMedicinesActivity.class);
        startActivity(intent);

    }
}
