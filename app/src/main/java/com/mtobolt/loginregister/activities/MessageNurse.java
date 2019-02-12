package com.mtobolt.loginregister.activities;

import android.Manifest;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mtobolt.loginregister.R;


public class MessageNurse extends AppCompatActivity {

    EditText phNum;
    EditText message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btnSendSMS;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_nurse);
        //checking for permission
        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.SEND_SMS},1);
        final EditText phNum = (EditText) findViewById(R.id.phNum);
        final EditText message = (EditText) findViewById(R.id.message);

        findViewById(R.id.btnSend).setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                String str1 = phNum.getText().toString();
                String str2 = message.getText().toString();
                sendSMS(str1, str2);
                Toast.makeText(getBaseContext(), "SMS sent",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void sendSMS(String phoneNumber, String message){
        SmsManager sms= SmsManager.getDefault();
        sms.sendTextMessage(phoneNumber, null, message, null, null);
    }
}