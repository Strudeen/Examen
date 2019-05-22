package com.stru.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button c_to_f;
    Button f_to_c;
    Button c_to_k;
    Button k_to_c;
    Button c_to_m;
    Button m_to_c;
    Button c_to_i;
    Button i_to_c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        c_to_f = (Button)findViewById(R.id.c_to_f);
        f_to_c = (Button)findViewById(R.id.f_to_c);
        c_to_k = (Button)findViewById(R.id.c_to_k);
        k_to_c = (Button)findViewById(R.id.k_to_c);
        c_to_m = (Button)findViewById(R.id.c_to_m);
        m_to_c = (Button)findViewById(R.id.met_to_cen);
        c_to_i = (Button)findViewById(R.id.cen_to_in);
        i_to_c = (Button)findViewById(R.id.in_to_cen);


        c_to_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c_tof = new Intent(MainActivity.this, Celcius_to_farenheit.class);
                startActivity(c_tof);
            }
        });

        f_to_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f_toc = new Intent(MainActivity.this, far_to_cel.class);
                startActivity(f_toc);
            }
        });
        c_to_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c_tok = new Intent(MainActivity.this, cel_to_kel.class);
                startActivity(c_tok);
            }
        });
        k_to_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k_toc = new Intent(MainActivity.this, kel_to_cel.class);
                startActivity(k_toc);
            }
        });
        c_to_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c_tom = new Intent(MainActivity.this, cen_to_met.class);
                startActivity(c_tom);
            }
        });
        m_to_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m_toc = new Intent(MainActivity.this, met_to_cen.class);
                startActivity(m_toc);
            }
        });
        c_to_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c_toi = new Intent(MainActivity.this, cen_to_inc.class);
                startActivity(c_toi);
            }
        });
        i_to_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i_toc = new Intent(MainActivity.this, inc_to_cen.class);
                startActivity(i_toc);
            }
        });

    }
}
