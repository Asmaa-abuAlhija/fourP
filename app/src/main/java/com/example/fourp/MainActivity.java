package com.example.fourp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    int count1=0,count2=0,count3=0,count4=0;
    String num2,num1,sum,min,mult,d;
    int number1,number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }
    public void countmin(View view) {
        count2++;
    }
    public void countplus(View view) {
        count1++;
    }
    public void mult(View view) {
        count3++;
    }
    public void d(View view) {
        count4++;
    }

    public void res(View view) {
        EditText num1Text = findViewById(R.id.num1);

        num1 = num1Text.getText().toString();
        num2 = ((EditText)findViewById(R.id.num2)).getText().toString();
        TextView showDetalis = (TextView) (findViewById(R.id.det));
        number1=Integer.parseInt(num1);
        number2=Integer.parseInt(num2);
        if(count1!=0){
            sum= (String) ( number1 + number2);
            showDetalis.setText(number1+number2);
            count1=0;
        }
        if(count2!=0){
            min=(String)(number1-number2);
            showDetalis.setText(min);
            count1=0;
        }
        if(count3!=0){
            mult=(String)(number1*number2);
            showDetalis.setText(mult);
            count3=0;
        }
        if(count4!=0){
            d=(String) (number1+number2);
            if(number2!=0){
                showDetalis.setText(d);
            }
            else {
                Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
            }
            count4=0;
        }

    }
}