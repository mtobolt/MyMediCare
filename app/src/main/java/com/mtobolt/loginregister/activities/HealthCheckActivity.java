package com.mtobolt.loginregister.activities;

import android.content.Intent;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.mtobolt.loginregister.R;
import com.mtobolt.loginregister.helpers.Conversions;

public class HealthCheckActivity extends AppCompatActivity {

    Button btnHeathCheck, btnMessageNurse;
    EditText temp;
    EditText bloodPressureHigher;
    EditText bloodPressureLower;
    EditText heartRate;
    TextView result;
    double num1, num2, num3, sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_check);


        temp = (EditText)findViewById(R.id.etTemp);
        bloodPressureHigher = (EditText)findViewById(R.id.etBloodPressureHigher);
        bloodPressureLower = (EditText)findViewById(R.id.etBloodPressureLower);
        heartRate = (EditText)findViewById(R.id.etHeartRate);
        result = (TextView)findViewById(R.id.results);
        btnHeathCheck = (Button)findViewById(R.id.btnHealthCheck);


        btnHeathCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Conversions conversions = new Conversions();
                RadioButton cb = (RadioButton)findViewById(R.id.cb);
                RadioButton fb = (RadioButton)findViewById(R.id.fb);
                double temp2 = Double.parseDouble(String.valueOf(temp.getText()));
                double bph = Double.parseDouble(String.valueOf(bloodPressureHigher.getText()));
                double bpl = Double.parseDouble(String.valueOf(bloodPressureLower.getText()));
                double hr = Double.parseDouble(String.valueOf(heartRate.getText()));

                if(cb.isChecked()) {
                    if(temp2 < 37 && bph < 120 && bpl < 80 && hr > 39 && hr < 160)
                    {
                        result.setText("You are in normal Health, keep it up!");
                    }
                    else if(temp2 == 37 || temp2 == 38 && bph >= 120 && bph <= 180 && bpl >= 80 && bpl <= 110 && hr < 160)
                    {
                        result.setText("You are in low risk. You may want to take some measures to get yourself in the normal zone.");
                    }
                    else if(temp2 > 38 && bph > 180 && bpl > 110 && hr > 160)
                    {
                        result.setText("You are at high risk, please consult your Nurse/GB.");
                    }
                    else
                    {
                        result.setText("I was not able to implement statements for every possible combination of health readings.");
                    }
                }
                else if(fb.isChecked())
                {
                    if(temp2 < 98.6 && bph < 120 && bpl < 80 && hr > 39 && hr < 160)
                    {
                        result.setText("You are in normal health, keep it up!");
                    }
                    else if(temp2 > 98.6 & temp2 < 100.4 && bph >= 120 && bph <= 180 && bpl >= 80 && bpl <= 110 && hr < 160)
                    {
                        result.setText("You are in low risk. You may want to take some measures to get yourself in the normal zone.");
                    }
                    else if(temp2 > 100.4 && bph > 180 && bpl > 110 && hr > 160)
                    {
                        result.setText("You are at high risk. Please consult your Nurse/GB.");
                    }
                    else
                    {
                        result.setText("I was not able to implement statements for every possible combination of health readings.");
                    }
                }

            }
        });

        Button btnMessageNurse = (Button)findViewById(R.id.btnMessageNurse);

        btnMessageNurse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HealthCheckActivity.this, MessageNurse.class));
            }
        });

        Button btnLogout = (Button)findViewById(R.id.btnLogout);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HealthCheckActivity.this, LoginActivity.class));
            }
        });


    }

}
