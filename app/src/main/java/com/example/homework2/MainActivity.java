package com.example.homework2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null){
            num = savedInstanceState.getInt(key);
            tv_result.setText(String.valueOf(num));
        }
        tv_num1 = findViewById(R.id.etm_number1);
        tv_num2 = findViewById(R.id.etm_number2);
        tv_num3 = findViewById(R.id.etm_number3);
        tv_result = findViewById(R.id.tv_result);
        btn_result = findViewById(R.id.btn_result);

        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 num =Integer.parseInt(tv_num1.getText().toString())+
                         Integer.parseInt(tv_num2.getText().toString())+
                         Integer.parseInt(tv_num3.getText().toString());
            }
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState){
        outState.putInt(key, num);
        super.onSaveInstanceState(outState);
    }

    private EditText tv_num1, tv_num2, tv_num3;
    private TextView tv_result;
    private Button btn_result;
    private int num = 0;
    private static final String key = "num";
}