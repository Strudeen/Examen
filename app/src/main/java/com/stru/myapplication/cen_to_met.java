package com.stru.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class cen_to_met extends AppCompatActivity {
    EditText centimetro;
    TextView metro;
    Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cen_to_met);

        this.setTitle(R.string.app_name5);

        centimetro = (EditText)findViewById(R.id.editText);
        metro = (TextView)findViewById(R.id.textView5);
        calcular = (Button)findViewById(R.id.button);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Double centi;
                    centi = Double.parseDouble(centimetro.getText().toString())/100;
                    metro.setText(""+centi+"m");
                } catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Ingrese un valor valido",Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}
