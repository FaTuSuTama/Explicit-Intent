package com.example.fatusutama.newexplicitintent.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView nameTv;
    TextView passwordTv;
    String name;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        nameTv=(TextView)findViewById(R.id.nameTv);
        passwordTv=(TextView)findViewById(R.id.passwordTv);

        name=getIntent().getStringExtra("name");
        password=getIntent().getStringExtra("password");

        nameTv.setText(name);
        passwordTv.setText(password);


    }
}
