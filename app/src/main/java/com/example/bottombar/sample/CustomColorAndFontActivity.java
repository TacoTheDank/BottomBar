package com.example.bottombar.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.roughike.bottombar.BottomBar;

/**
 * Created by mikemilla on 7.17.2016.
 * http://mikemilla.com
 */
public class CustomColorAndFontActivity extends AppCompatActivity {

    private TextView messageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_color_and_font);

        messageView = findViewById(R.id.messageView);

        BottomBar bottomBar = findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(tabId -> messageView.setText(TabMessage.get(tabId, false)));

        bottomBar.setOnTabReselectListener(tabId -> Toast.makeText(getApplicationContext(),
                TabMessage.get(tabId, true), Toast.LENGTH_LONG).show());
    }
}
