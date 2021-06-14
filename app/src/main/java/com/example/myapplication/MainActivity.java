package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Form");

        EditText mNameEt = findViewById(R.id.nameEt);
        EditText mEmailEt = findViewById(R.id.emailEt);
        EditText mPhoneEt = findViewById(R.id.phonrEt);

        Button mSaveBtn = findViewById(R.id.saveBtn);

        mSaveBtn.setOnClickListener(v -> {
            //get data from editText
            String name = mNameEt.getText().toString();
            String email = mEmailEt.getText().toString();
            String phone = mPhoneEt.getText().toString();

            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("Name", name);
            intent.putExtra("Email", email);
            intent.putExtra("Phone", phone);
            startActivity(intent);

        });
    }
}
