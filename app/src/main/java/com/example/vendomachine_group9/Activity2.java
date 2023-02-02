package com.example.vendomachine_group9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    ImageView imageView;
    int imagevalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        TextView Price, Amount, Change;
        Price = findViewById(R.id.Amount);
        Amount = findViewById(R.id.productName);
        Change = findViewById(R.id.result);
        imageView = findViewById(R.id.productimage);


        String Pricestr = getIntent().getStringExtra("Amount");
        String Amountstr = getIntent().getStringExtra("Price");
        String Changestr = getIntent().getStringExtra("change");


        Price.setText(Pricestr);
        Amount.setText(Amountstr);
        Change.setText(Changestr);

        // check if any value sent from previous activity
        Bundle bundle = getIntent().getExtras();

        // if bundle is not null then get the image value
        if (bundle != null) {
            imagevalue = bundle.getInt("image");
        }
        imageView.setImageResource(imagevalue);

    }

}
