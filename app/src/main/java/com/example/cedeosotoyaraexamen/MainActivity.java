package com.example.cedeosotoyaraexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    private FrameLayout frame1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.frame1, new fr1()).commit();
    }
    public void mostrarFragmento1(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frame1, new fr1()).commit();
    }
    public void mostrarFragmento2(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frame1, new fr2()).commit();
    }


}