package com.example.cedeosotoyaraexamen;

import android.content.res.Configuration;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.frame1, new fr1())
                    .addToBackStack(null)
                    .commit();
        } else {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.frame1, new fr1())
                    .addToBackStack(null)
                    .commit();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.frame2, new fr2())
                    .addToBackStack(null)
                    .commit();
        }

    }
}