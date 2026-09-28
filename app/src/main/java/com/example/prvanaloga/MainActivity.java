package com.example.prvanaloga;

import android.os.Bundle;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.widget.Toast;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        findViewById(R.id.button).setOnClickListener(v -> {
            Toast.makeText(MainActivity.this,
                    "My first Android Studio application!",
                    Toast.LENGTH_SHORT).show();
        });

        findViewById(R.id.floatingActionButton).setOnClickListener(v -> {
            Snackbar.make(v,
                    "Just another option for button.",
                    Snackbar.LENGTH_LONG).show();
        });
    }
}