package com.example.bilge.linearlayoutcalismasi;

import android.app.Activity;
import android.os.Bundle;
public class LinearLayoutExampleActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int exampleId= getIntent().getIntExtra("exampleId",0);

        switch (exampleId){
            case LinearLayoutDemoActivity.HORIZANTAL_EXAMPLE:
                setContentView(R.layout.activity_linear_layout_horizantal);
                break;

            case LinearLayoutDemoActivity.VERTICAL_EXAMPLE:
                setContentView(R.layout.activity_linear_layout_vertical);
                break;
            case LinearLayoutDemoActivity.GRAVITY_EXAMPLE:
                setContentView(R.layout.activity_linear_layout_gravity);
                break;
            case LinearLayoutDemoActivity.WEIGHT_EXAMPLE:
                setContentView(R.layout.activity_linear_layout_weight);
                break;

                default:
                    break;



        }




    }
}
