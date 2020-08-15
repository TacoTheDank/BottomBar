package com.example.bottombar.sample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.roughike.bottombar.BottomBar;

public class IconsOnlyActivity extends Activity {
    private TextView messageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icons_only);

        messageView = findViewById(R.id.messageView);

        BottomBar bottomBar = findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(tabId -> messageView.setText(TabMessage.get(tabId, false)));

        bottomBar.setOnTabReselectListener(tabId -> Toast.makeText(getApplicationContext(),
                TabMessage.get(tabId, true), Toast.LENGTH_LONG).show());
    }
}
