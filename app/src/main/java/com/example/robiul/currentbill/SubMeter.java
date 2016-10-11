package com.example.robiul.currentbill;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SubMeter extends AppCompatActivity {

    EditText editText1,editText2;
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_meter);
        editText1=(EditText)findViewById(R.id.editText4);
        editText2=(EditText)findViewById(R.id.editText5);
        textView=(TextView)findViewById(R.id.result);
        button=(Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double minusMain=MainActivity.presentUnit-MainActivity.previousUnit;
                double pSub=Double.parseDouble(editText1.getText().toString());
                double ppSub=Double.parseDouble(editText2.getText().toString());
                double minusSub=ppSub-pSub;
                double resultSub=((MainActivity.totalBill)*minusSub)/minusMain;
                double re=MainActivity.totalBill-resultSub;
                textView.setVisibility(View.VISIBLE);
                textView.setText("সাব মিটারের বিল = "+resultSub+" \nমেইন মিটারের বিল = "+re);
            }
        });

    }
}
