package com.aula01.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNome;
    private EditText editTextSNome;
    private EditText editTextIdade;
    private EditText editTextCidade;
    private Button buttonSaudacao;
    private TextView textViewSaudacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNome = findViewById(R.id.editTextNome);
        editTextIdade = findViewById(R.id.editTextIdade);
        editTextCidade = findViewById(R.id.editTextCidade);
        editTextSNome = findViewById(R.id.editTextSNome);
        buttonSaudacao = findViewById(R.id.buttonSaudacao);
        textViewSaudacao = findViewById(R.id.textViewSaudacao);

        buttonSaudacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = editTextNome.getText().toString();
                String sobrenome = editTextSNome.getText().toString();
                String Idade = editTextIdade.getText().toString();
                String Cidade = editTextCidade.getText().toString();
                String saudacao = "Olá " + nome + " " + sobrenome + ", idade: " + Idade + " anos" + ", morador da cidade de " + Cidade;
                textViewSaudacao.setText(saudacao);
            }
        });
    }
}
