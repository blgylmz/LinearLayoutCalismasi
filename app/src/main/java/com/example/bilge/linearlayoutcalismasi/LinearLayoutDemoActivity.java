package com.example.bilge.linearlayoutcalismasi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LinearLayoutDemoActivity extends Activity {

    public static final int HORIZANTAL_EXAMPLE=0;
    public static final int VERTICAL_EXAMPLE=1;
    public static final int WEIGHT_EXAMPLE=2;
    public static final int GRAVITY_EXAMPLE=3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout_demo);

        Button showHorizantalExample = findViewById(R.id.btn_show_horizantal_example);

        showHorizantalExample.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                showExample(HORIZANTAL_EXAMPLE);
            }
        });

        Button showVerticalExample = findViewById(R.id.btn_show_vertical_example);

        showVerticalExample.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                showExample(VERTICAL_EXAMPLE);
            }
        });

        Button showWeightExample = findViewById(R.id.btn_show_weight_example);
        showWeightExample.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                showExample(WEIGHT_EXAMPLE);
            }
        });

        Button showGravityExample= findViewById(R.id.btn_show_gravity_example);
        showGravityExample.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                showExample(GRAVITY_EXAMPLE);
            }
        });
    }

    public void showExample(int exampleId){

        Intent intent = new Intent(LinearLayoutDemoActivity.this,LinearLayoutExampleActivity.class);
        intent.putExtra("exampleId",exampleId);
        startActivity(intent);


        //Yukarıda bulunan bütün düğmeler aynı activity'i açmaktadır. Activity'nin
        // içine geçilen parametre tipine göre setContentView metoduna verilen layout id'si değişmektedir.


    }
}
