package com.example.vendomachine_group9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button blackbtn = findViewById(R.id.Black),
                frappbtn = findViewById(R.id.frapp),
                mochabtn = findViewById(R.id.mocha),
                vanillabtn = findViewById(R.id.Vanilla),
                submitbtn = findViewById(R.id.Submitbtn);


        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText inputText = findViewById(R.id.editTextNumber);
                String text = inputText.getText().toString();
                String inputAmount = text;
                int convertedAmount = Integer.valueOf(inputAmount);
                if (convertedAmount >=18) {
                    TextView blacktxt = findViewById(R.id.Black);
                    String blackstr = blacktxt.getText().toString();

                    int change = convertedAmount - 15;
                    String changestr = String.valueOf(change);

                    blacktxt.setTextColor(Color.parseColor("#00FF00"));
                    blackbtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            // Perform action when the Button is clicked
                            Intent jumppage = new Intent(MainActivity.this, Activity2.class);
                            jumppage.putExtra("Amount", inputAmount);
                            jumppage.putExtra("Price", blackstr);
                            jumppage.putExtra("image",R.drawable.black_coffee);
                            jumppage.putExtra("change", changestr);
                            startActivity(jumppage);

                        }
                    });
                } else {
                    TextView blacktxt = findViewById(R.id.Black);
                    blacktxt.setTextColor(Color.parseColor("#FF0000"));
                }
                if (convertedAmount >=20) {
                    //Nova
                    TextView frapptxt = findViewById(R.id.frapp);
                    String frappstr = frapptxt.getText().toString();

                    int change = convertedAmount - 20;
                    String changestr = String.valueOf(change);

                    frapptxt.setTextColor(Color.parseColor("#00FF00"));
                    frappbtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent jumppage = new Intent(MainActivity.this, Activity2.class);

                            jumppage.putExtra("Amount", inputAmount);
                            jumppage.putExtra("Price", frappstr);
                            jumppage.putExtra("image",R.drawable.frappucino);
                            jumppage.putExtra("change", changestr);
                            startActivity(jumppage);
                        }
                    });
                } else {
                    TextView frapptxt = findViewById(R.id.frapp);
                    frapptxt.setTextColor(Color.parseColor("#FF0000"));
                }
                if (convertedAmount >=25) {
                    //Piattos
                    TextView mochatxt = findViewById(R.id.mocha);
                    String mochastr = mochatxt.getText().toString();

                    int change = convertedAmount - 25;
                    String changestr = String.valueOf(change);

                    mochatxt.setTextColor(Color.parseColor("#00FF00"));
                    mochabtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent jumppage = new Intent(MainActivity.this, Activity2.class);
                            jumppage.putExtra("Amount", inputAmount);
                            jumppage.putExtra("Price", mochastr);
                            jumppage.putExtra("image",R.drawable.mocha);
                            jumppage.putExtra("change", changestr);
                            startActivity(jumppage);
                        }
                    });
                } else {
                    TextView mochatxt = findViewById(R.id.mocha);
                    mochatxt.setTextColor(Color.parseColor("#FF0000"));
                }
                if (convertedAmount >=30) {
                    //Vanilla
                    TextView Vanillatxt = findViewById(R.id.Vanilla);
                    String Vanillastr = Vanillatxt.getText().toString();

                    int change = convertedAmount - 30;
                    String changestr = String.valueOf(change);

                    Vanillatxt.setTextColor(Color.parseColor("#00FF00"));
                    vanillabtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent jumppage = new Intent(MainActivity.this, Activity2.class);
                            jumppage.putExtra("Amount", inputAmount);
                            jumppage.putExtra("Price", Vanillastr);
                            jumppage.putExtra("image",R.drawable.vanilla);
                            jumppage.putExtra("change", changestr);
                            startActivity(jumppage);
                        }
                    });
                } else {
                    TextView Vanillatxt = findViewById(R.id.Vanilla);
                    Vanillatxt.setTextColor(Color.parseColor("#FF0000"));
                }
            }
        });

    }
}