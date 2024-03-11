package com.example.practical152;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    CheckBox chk1, chk2, chk3;
    String selected = " ";
    int cost = 0;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chk1 = (CheckBox) findViewById(R.id.chk1);
        chk2 = (CheckBox) findViewById(R.id.chk2);
        chk3 = (CheckBox) findViewById(R.id.chk3);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chk1.isChecked()) {
                    cost += 100;
                    selected += "Pizza and price is :100\n";

                }
                if (chk2.isChecked()) {
                    cost += 50;
                    selected += "Coffee and price is : 50\n";
                }
                if (chk3.isChecked()) {
                    cost += 120;
                    selected += "Burger and price is : 120\n";
                }
                Toast t = new Toast(getApplicationContext());
                t.setGravity(Gravity.CENTER, 0, 0);
                t.setText(selected + "Total Price is :" + cost);
                t.show();
            }
        });
    }
}