package com.example.exercco2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_Concatenar;
    TextView txt_Resultado;
    EditText txt_Nome1,txt_Nome2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_Concatenar.findViewById(R.id.btn_concatenar);
        txt_Nome1.findViewById(R.id.txt_nome1);
        txt_Nome2.findViewById(R.id.txt_nome2);
        txt_Resultado.findViewById(R.id.txt_resultado);

        btn_Concatenar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome1,nome2;
                nome1=txt_Nome1.getText().toString();
                nome2=txt_Nome2.getText().toString();
                txt_Resultado.setText("Olá"+nome1+""+nome2);

                if(nome1.isEmpty()|| nome2.isEmpty()){
                    txt_Resultado.setText("Dados não insiridos!!Erro");
                }

            }
        });
    }
}