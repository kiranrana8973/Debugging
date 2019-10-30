package com.example.debugging;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.debugging.arithmetic.Arithmetic;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etFirst,etSecond;
    private Button btnSum,btnMultiply;
    private Arithmetic arithmetic;
    private int first,second ,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirst = findViewById(R.id.etFirst);
        etSecond = findViewById(R.id.etSecond);
        btnSum = findViewById(R.id.btnSum);
        btnMultiply = findViewById(R.id.btnMultiply);

        btnSum.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSum :
                first =Integer.parseInt(etFirst.getText().toString());
                second =Integer.parseInt(etSecond.getText().toString());
                arithmetic = new Arithmetic(first,second);
                result = arithmetic.add();
                Toast.makeText(this, "Sum is : " + result, Toast.LENGTH_SHORT).show();

                break;

            case R.id.btnMultiply :
                first =Integer.parseInt(etFirst.getText().toString());
                second =Integer.parseInt(etFirst.getText().toString());
                arithmetic = new Arithmetic(first,second);
                result = arithmetic.mult();
                Toast.makeText(this, "Multiplication is : " + result, Toast.LENGTH_SHORT).show();

                break;

        }
    }
}
