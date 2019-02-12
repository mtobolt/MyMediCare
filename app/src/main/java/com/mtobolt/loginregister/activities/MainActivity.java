package com.mtobolt.loginregister.activities;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mtobolt.loginregister.R;

public class MainActivity extends AppCompatActivity {

    private final AppCompatActivity activity = MainActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHealthCheck = (Button)findViewById(R.id.healthCheck);

        btnHealthCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, HealthCheckActivity.class));
            }
        });

        Button btnLogout = (Button)findViewById(R.id.btnLogout);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });

        Button btnUserList = (Button)findViewById(R.id.btnViewUser);

        btnUserList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, UsersListActivity.class));
            }
        });

    }
}
