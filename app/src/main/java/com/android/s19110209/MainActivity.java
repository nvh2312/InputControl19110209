package com.android.s19110209;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cb1, cb2, cb3, cb4, cb5;
    Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder result=new StringBuilder();
                result.append("Toppings: ");
                Resources res = getResources();
                if(cb1.isChecked()){
                    String ten = cb1.getText().toString();
                    result.append(ten+" ");
                }
                if(cb2.isChecked()){
                    String ten = cb2.getText().toString();
                    result.append(ten+" ");
                }
                if(cb3.isChecked()){
                    String ten = cb3.getText().toString();
                    result.append(ten+" ");
                }
                if(cb4.isChecked()){
                    String ten = cb4.getText().toString();
                    result.append(ten+" ");
                }
                if(cb5.isChecked()){
                    String ten = cb5.getText().toString();
                    result.append(ten+" ");
                }

                Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();

            }
        });

    }
    private void AnhXa() {
        cb1 = (CheckBox) findViewById(R.id.cb_chocolate);
        cb2 = (CheckBox) findViewById(R.id.cb_sprinkles);
        cb3 = (CheckBox) findViewById(R.id.cb_nuts);
        cb4 = (CheckBox) findViewById(R.id.cb_cherries);
        cb5 = (CheckBox) findViewById(R.id.cb_cookie);
        btnShow =  (Button) findViewById(R.id.btn_show);
    }
}