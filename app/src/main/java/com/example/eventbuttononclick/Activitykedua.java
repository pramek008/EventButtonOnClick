package com.example.eventbuttononclick;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activitykedua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman2);
        TextView name = findViewById(R.id.tampilNameH2);
        TextView pass = findViewById(R.id.tampilPassH2);

        Bundle bundle = getIntent().getExtras();
        name.setText(bundle.getString("data1"));
        pass.setText(bundle.getString("data2"));
    }
}