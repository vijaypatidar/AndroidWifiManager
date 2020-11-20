package com.vkpapps.wifimanager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.vkpapps.apmanager.APManager;
import com.vkpapps.apmanager.DefaultFailureListener;

public class MainActivity extends AppCompatActivity implements APManager.OnSuccessListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnTurnOn).setOnClickListener(v -> {
            APManager apManager = APManager.getApManager(this);
            apManager.turnOnHotspot(this,
                    this,
                    new DefaultFailureListener(this)
            );
        });
    }


    @Override
    public void onSuccess(@NonNull String ssid, @NonNull String password) {
        Toast.makeText(this, ssid + "," + password, Toast.LENGTH_LONG).show();
        startActivity(new Intent(this, APDetailActivity.class));
    }
}