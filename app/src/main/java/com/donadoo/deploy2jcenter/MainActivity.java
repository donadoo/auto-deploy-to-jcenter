package com.donadoo.deploy2jcenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.donadoo.autodeploy.AutoDeploy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AutoDeploy.deploy();
    }
}
