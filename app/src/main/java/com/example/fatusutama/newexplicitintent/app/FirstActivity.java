package com.example.fatusutama.newexplicitintent.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {
    EditText nameEt;
    EditText passwordEt;
    String name;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        nameEt=(EditText)findViewById(R.id.nameEt);
        passwordEt=(EditText)findViewById(R.id.passwordEt);
    }

    public void submitInformation(View view) {
        name=nameEt.getText().toString();
        password=passwordEt.getText().toString();

        Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
        intent.putExtra("name",name);
        intent.putExtra("password",password);

        startActivity(intent);
    }
}
