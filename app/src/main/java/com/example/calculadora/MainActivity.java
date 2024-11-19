package com.example.calculadora;

import static java.lang.System.in;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        List<String> buttons = Arrays.asList("0","1","2","3","4","5","6","7","8","9","multiplicar","divsion","resta","sumka","igual");
        int tamaño = buttons.size();

        for (int i = 0; i < tamaño; i++){
            //String b1 = "Button"+ buttons.get(i);
            Button b;
            String cadena = "b" + R.id.buttons[i];
            b = (Button) findViewById(cadena);
            b.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    if (event.getAction() == MotionEvent.ACTION_DOWN || event.getAction() == MotionEvent.ACTION_BUTTON_PRESS) {
                        v.setBackgroundColor(Color.parseColor("#2596be"));
                    }
                    if (event.getAction() == MotionEvent.ACTION_UP || event.getAction() == MotionEvent.ACTION_BUTTON_RELEASE) {
                        v.setBackgroundColor(Color.parseColor("#6854a4"));
                    }
                    return false;
                }
            });
        }

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button b1 = (Button) findViewById(R.id.igual);


        b1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN || event.getAction() == MotionEvent.ACTION_BUTTON_PRESS) {
                    v.setBackgroundColor(Color.parseColor("#2596be"));
                }
                if (event.getAction() == MotionEvent.ACTION_UP || event.getAction() == MotionEvent.ACTION_BUTTON_RELEASE) {
                    v.setBackgroundColor(Color.parseColor("#6854a4"));
                }
                return false;
            }
        });

        Button clear = (Button) findViewById(R.id.clear);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            //On click function
            public void onClick(View view) {
                findViewById(R.id.pantalla);

            }
        });
    }
    // https://imagecolorpicker.com/
}