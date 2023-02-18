package com.example.notify;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    String CHANNEL_ID="channelID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button notifyBtn=findViewById(R.id.getNotify);

        NotificationModule notification= new NotificationModule("NotificationTitle","NotificationContent","NotificationName",R.drawable.ic_launcher_foreground,MainActivity.this,CHANNEL_ID);

        notifyBtn.setOnClickListener((View v) -> {

            notification.fireNotification();

        });
    }
}