package com.example.fourp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText etNum1,etNum2;
    private TextView res;
    private Button plus,min,mult,div;

    @SuppressWarnings("MissingInFlatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
        res=findViewById(R.id.res);
        plus=findViewById(R.id.plus);
        plus.setOnClickListener((View.OnClickListener) this);
        min=findViewById(R.id.min);
        min.setOnClickListener((View.OnClickListener) this);
        mult=findViewById(R.id.x);
        mult.setOnClickListener((View.OnClickListener) this);
        div=findViewById(R.id.div);
        div.setOnClickListener((View.OnClickListener) this);

    }


    public void res(View view) {
        int num,num2;
        if (!(etNum1.getText().toString().isEmpty()||etNum2.getText().toString().isEmpty())){
            num=Integer.parseInt(etNum1.getText().toString());
            num2=Integer.parseInt(etNum2.getText().toString());
            etNum1.setText("");
            etNum2.setText("");
            if (view.getId()==R.id.plus)
                res.setText(String.valueOf(num+num2));
            if (view.getId()==R.id.min)
                res.setText(String.valueOf(num-num2));
            if (view.getId()==R.id.x)
                res.setText(String.valueOf(num*num2));
            if (view.getId()==R.id.div&&num2!=0)
                res.setText(String.valueOf(num/num2));
        }
        else
            Toast.makeText(this, "Please insert numbers...", Toast.LENGTH_SHORT).show();
    }
}