package com.stru.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class cel_to_kel extends AppCompatActivity {


    EditText cent;
    TextView kel;
    Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cel_to_kel);

        this.setTitle(R.string.app_name3);

        cent = (EditText)findViewById(R.id.editText);
        kel = (TextView)findViewById(R.id.textView5);
        calcular = (Button)findViewById(R.id.button);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Double kelvin;
                    kelvin = Double.parseDouble(cent.getText().toString())+273.15;
                    kel.setText(""+ kelvin+"°K");

                } catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Ingrese un valor valido",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
