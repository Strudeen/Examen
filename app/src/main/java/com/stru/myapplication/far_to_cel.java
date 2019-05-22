package com.stru.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class far_to_cel extends AppCompatActivity {

    EditText far;
    TextView cent;
    Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_far_to_cel);

        this.setTitle(R.string.app_name2);

        far = (EditText)findViewById(R.id.editText);
        cent = (TextView)findViewById(R.id.textView5);

        calcular = (Button)findViewById(R.id.button_calcular);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    float centi;
                    centi = (Float.parseFloat(far.getText().toString())-32)/(1.8f);
                    cent.setText(""+centi+"°C");
                } catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Ingrese un valor valido", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}
