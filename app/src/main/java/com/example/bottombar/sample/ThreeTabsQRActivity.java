package com.example.bottombar.sample;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.roughike.bottombar.BottomBar;

/**
 * Created by iiro on 7.6.2016.
 */
public class ThreeTabsQRActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_tabs_quick_return);

        BottomBar bottomBar = findViewById(R.id.bottomBar);

        // We're doing nothing with this listener here this time. Check example usage
        // from ThreeTabsActivity on how to use it.
        bottomBar.setOnTabSelectListener(tabId -> {

        });
    }
}
