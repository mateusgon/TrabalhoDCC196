package com.example.mateu.dcc196_trabalho02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pergunta3Activity extends AppCompatActivity {

    private Button btn01;
    private Button btn02;
    private Button btn03;
    private Button btn04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta3);

        btn01 = (Button) findViewById(R.id.btnResposta09);
        btn02 = (Button) findViewById(R.id.btnResposta10);
        btn03 = (Button) findViewById(R.id.btnResposta11);
        btn04 = (Button) findViewById(R.id.btnResposta12);


        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pergunta3Activity.this, Pergunta4Activity.class);
                startActivity(intent);
            }
        });

        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pergunta3Activity.this, Pergunta4Activity.class);
                startActivity(intent);
            }
        });

        btn03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pergunta3Activity.this, Pergunta4Activity.class);
                startActivity(intent);
            }
        });

        btn04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pergunta3Activity.this, Pergunta4Activity.class);
                startActivity(intent);
            }
        });

    }
}
