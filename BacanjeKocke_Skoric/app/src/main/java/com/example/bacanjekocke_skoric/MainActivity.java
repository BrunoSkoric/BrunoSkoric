package com.example.bacanjekocke_skoric;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.Random;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //View koristimo kako bi vidjeli Button i TextView u aplikaciji
        View buttonGenerate=(Button) findViewById(R.id.buttonGenerate);
        View textView=(TextView)findViewById(R.id.textViewNumber);
        View textView1=(TextView)findViewById(R.id.textViewNumber1);
        buttonGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Funkcija za generiranje nasumičnih brojeva
                final Random rand= new Random();
                //Deklaracija 2 nasumična broja
                int Number1=(rand.nextInt(6));
                int Number2=(rand.nextInt(6));
                ((TextView)textView).setText(String.valueOf(Number1));
                ((TextView)textView1).setText(String.valueOf(Number2));
            }
        });
    }
}