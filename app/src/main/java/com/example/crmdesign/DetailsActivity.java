package com.example.crmdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        boolean isChecked = true;
        CheckBox cb1 = (CheckBox)findViewById(R.id.cb1);
        cb1.setChecked(isChecked);

    }
}