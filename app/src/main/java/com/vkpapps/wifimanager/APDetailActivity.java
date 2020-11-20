package com.vkpapps.wifimanager;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import com.vkpapps.apmanager.APManager;

public class APDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ap_detail);
        APManager apManager = APManager.getApManager(this);

        AppCompatTextView textView = findViewById(R.id.apDetail);
        String sb = "SSID : " +
                apManager.getSSID() +
                System.lineSeparator() +
                "PASS : " +
                apManager.getPassword();
        textView.setText(sb);

        findViewById(R.id.btnTurnOff).setOnClickListener(v -> {
            apManager.disableWifiAp();
            startActivity(new Intent(this,MainActivity.class));
            finish();
        });
    }
}