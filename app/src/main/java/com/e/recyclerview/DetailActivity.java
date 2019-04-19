package com.e.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailActivity extends AppCompatActivity {
 CircleImageView circImg;
 TextView FullName, PhoneNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        circImg = findViewById(R.id.imageProfile);
        FullName = findViewById(R.id.tvName);
        PhoneNo = findViewById(R.id.tvPhone);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            circImg.setImageResource(bundle.getInt("image"));
            FullName.setText(bundle.getString("name"));
            PhoneNo.setText(bundle.getString("phone"));
        }
    }
}
