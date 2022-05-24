package com.example.tnhchuvidintchhnhbnhhnh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edt1,edt2,edt3;
    private Button btn1,btn2;
    private TextView ketqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = (EditText)findViewById(R.id.etd1);
        edt2 = (EditText)findViewById(R.id.edt2);
        edt3 = (EditText)findViewById(R.id.edt3);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        ketqua = (TextView) findViewById(R.id.ketqua);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int canha = Integer.parseInt(edt1.getText().toString());
                int canhb = Integer.parseInt(edt2.getText().toString());
                int kqua = 2 * (canha + canhb);
                ketqua.setText("Chu vi hình bình hành là:" + kqua);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int canha = Integer.parseInt(edt1.getText().toString());
                int chcaoh = Integer.parseInt(edt3.getText().toString());
                int kqua = canha * chcaoh;
                ketqua.setText("Diện tích hình bình hành là:" + kqua);
            }
        });
    }
}