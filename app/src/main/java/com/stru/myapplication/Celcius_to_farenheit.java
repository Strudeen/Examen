package com.stru.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Celcius_to_farenheit extends AppCompatActivity {




    EditText cent;
    TextView far;
    Button calcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celcius_to_farenheit);

        this.setTitle(R.string.app_name1);


        cent = (EditText)findViewById(R.id.editText);
        far = (TextView)findViewById(R.id.textView5);
        calcular = (Button)findViewById(R.id.button);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try
                {
                    float faren;
                    faren = (1.8f)*Float.parseFloat(cent.getText().toString())+32;
                    far.setText(""+faren+"°F");
                } catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Ingrese un valor valido",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
