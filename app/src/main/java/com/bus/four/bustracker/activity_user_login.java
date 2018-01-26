package com.bus.four.bustracker;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class activity_user_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);



        Button login = (Button) findViewById(R.id.btnSignIn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialog pd = new ProgressDialog(activity_user_login.this);
                pd.setTitle("Download");
                pd.setMessage("Loading... Please Wait");
                pd.show();
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                finish();
            }
        });


    }
    public void forgotPass(View v)
    {
        Intent in=new Intent();
        in.setClass(getApplicationContext(),activity_forgot_pass.class);
        startActivity(in);
        finish();
    }
}
