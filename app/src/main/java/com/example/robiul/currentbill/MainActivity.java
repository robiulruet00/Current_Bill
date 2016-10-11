package com.example.robiul.currentbill;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText1,editText2,editText3;
    Button button;
    public static double previousUnit;
    public static double presentUnit;
    public static double totalBill;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=(EditText)findViewById(R.id.editText);
        editText2=(EditText)findViewById(R.id.editText2);
        editText3=(EditText)findViewById(R.id.editText3);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previousUnit=Double.parseDouble(editText1.getText().toString());
                presentUnit=Double.parseDouble(editText2.getText().toString());
                totalBill=Double.parseDouble(editText3.getText().toString());
                Intent intent=new Intent(getApplicationContext(),SubMeter.class);
                startActivity(intent);
            }
        });
    }
}
