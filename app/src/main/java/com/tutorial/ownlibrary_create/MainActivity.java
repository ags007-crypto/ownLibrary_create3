package com.tutorial.ownlibrary_create;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tutorial.toasty.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toaster.simpleToast(MainActivity.this,"Own Library Created");
    }
}