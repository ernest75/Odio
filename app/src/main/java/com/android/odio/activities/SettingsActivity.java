package com.android.odio.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.android.odio.R;
import com.android.odio.fragments.SettingsFragment;


public class SettingsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);

        /*Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setPopupTheme(R.style.ThemeOverlay_AppCompat_Light);
        if(toolbar!=null) {
            setSupportActionBar(toolbar);
        }*/
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayShowTitleEnabled(true);
            actionBar.setTitle(R.string.action_settings);
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
        }

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.container, new SettingsFragment())
                .commit();
    }
}
