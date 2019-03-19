package com.example.bilge.linearlayoutcalismasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showLinearLayoutDemo = findViewById(R.id.btn_show_linear_layouts);
        //Buton oluşturduk ve tanımladık

        showLinearLayoutDemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,LinearLayoutDemoActivity.class));
            }
        });

        //Butona tıklandığı esnada mainactivity de yeni bir intent oluşturarak
        // linearlayoutdemo aktivity sınıfına yönlendirme yaptık.




    }
}
