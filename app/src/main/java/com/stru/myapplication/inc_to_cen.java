package com.stru.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class inc_to_cen extends AppCompatActivity {
    EditText inc;
    TextView cen;
    Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inc_to_cen);

        inc = (EditText)findViewById(R.id.editText);
        cen = (TextView)findViewById(R.id.textView5);
        calcular = (Button)findViewById(R.id.button);
        this.setTitle(R.string.app_name8);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Double centi;
                    centi = Double.parseDouble(inc.getText().toString())*2.54;
                    cen.setText(""+centi+"cm");
                } catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Ingrese un valor valido",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
