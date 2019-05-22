package com.stru.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class cen_to_inc extends AppCompatActivity {
    EditText cen;
    TextView inc;
    Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cen_to_inc);

        cen = (EditText)findViewById(R.id.editText);
        inc = (TextView)findViewById(R.id.textView5);
        calcular = (Button)findViewById(R.id.button);

        this.setTitle(R.string.app_name7);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Double centi;
                    centi = Double.parseDouble(cen.getText().toString())/2.54;
                    inc.setText(""+centi+"”");
                } catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Ingrese un valor valido",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
