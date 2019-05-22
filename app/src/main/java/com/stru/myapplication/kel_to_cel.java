package com.stru.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class kel_to_cel extends AppCompatActivity {

    EditText kel;
    TextView cent;
    Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kel_to_cel);

        this.setTitle(R.string.app_name4);

        kel = (EditText)findViewById(R.id.editText);
        cent = (TextView)findViewById(R.id.textView5);
        calcular = (Button)findViewById(R.id.button);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Double centi;
                    centi = Double.parseDouble(kel.getText().toString())-273.15;
                    cent.setText(""+centi+"°C");

                } catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Ingrese un valor valido",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
