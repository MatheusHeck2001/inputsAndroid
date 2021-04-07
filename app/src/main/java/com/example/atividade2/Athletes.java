package com.example.atividade2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Athletes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_athletes);

        findViewById(R.id.calculateButton).setOnClickListener(new View.OnClickListener() {
            final ArrayList<String> names = new ArrayList<String>();
            final ArrayList<Double> times = new ArrayList<Double>();

            double media = 0;
            double dp = 0;

            @Override
            public void onClick(View v) {
                EditText nameEt = findViewById(R.id.athleteName);
                EditText timeEt = findViewById(R.id.athleteTime);
                String name = nameEt.getText().toString();
                Double time = Double.parseDouble(timeEt.getText().toString());

                TextView zero = findViewById(R.id.zero);
                TextView one = findViewById(R.id.one);
                TextView two = findViewById(R.id.two);
                TextView three = findViewById(R.id.three);
                TextView four = findViewById(R.id.four);
                TextView five = findViewById(R.id.five);
                TextView six = findViewById(R.id.six);
                TextView seven = findViewById(R.id.seven);
                TextView eight = findViewById(R.id.eight);
                TextView nine = findViewById(R.id.nine);

                TextView mediaShow = findViewById(R.id.mediaShow);
                TextView dpShow = findViewById(R.id.dpShow);


                names.add(name);
                times.add(time);

                if (names.size() == 10){
                    for (int i=0; i<10; i++){
                        media += times.get(i);
                    }
                    media = media/10;

                    for (Double vlr : times){
                        Double aux = vlr - media;
                        dp += aux*aux;
                    }
                    dp = Math.sqrt(dp / (times.size()-1));


                    mediaShow.setText(String.valueOf(media));
                    dpShow.setText(String.valueOf(dp));

                    zero.setText(names.get(0));
                    one.setText(names.get(1));
                    two.setText(names.get(2));
                    three.setText(names.get(3));
                    four.setText(names.get(4));
                    five.setText(names.get(5));
                    six.setText(names.get(6));
                    seven.setText(names.get(7));
                    eight.setText(names.get(8));
                    nine.setText(names.get(9));

                    double maior = 0;
                    int posicao = 0;
                    for (int i=0; i<10; i++){
                        if (times.get(i) > maior){
                            maior = times.get(i);
                            posicao = i;
                        }
                    }

                    switch (posicao){
                        case 0:
                            zero.setTextColor(Color.BLUE);
                            zero.setAllCaps(true);
                            zero.setBackgroundColor(Color.LTGRAY);
                            break;
                        case 1:
                            one.setTextColor(Color.BLUE);
                            one.setAllCaps(true);
                            one.setBackgroundColor(Color.LTGRAY);
                            break;
                        case 2:
                            two.setTextColor(Color.BLUE);
                            two.setAllCaps(true);
                            two.setBackgroundColor(Color.LTGRAY);
                            break;
                        case 3:
                            three.setTextColor(Color.BLUE);
                            three.setAllCaps(true);
                            three.setBackgroundColor(Color.LTGRAY);
                            break;
                        case 4:
                            four.setTextColor(Color.BLUE);
                            four.setAllCaps(true);
                            four.setBackgroundColor(Color.LTGRAY);
                            break;
                        case 5:
                            five.setTextColor(Color.BLUE);
                            five.setAllCaps(true);
                            five.setBackgroundColor(Color.LTGRAY);
                            break;
                        case 6:
                            six.setTextColor(Color.BLUE);
                            six.setAllCaps(true);
                            six.setBackgroundColor(Color.LTGRAY);
                            break;
                        case 7:
                            seven.setTextColor(Color.BLUE);
                            seven.setAllCaps(true);
                            seven.setBackgroundColor(Color.LTGRAY);
                            break;
                        case 8:
                            eight.setTextColor(Color.BLUE);
                            eight.setAllCaps(true);
                            eight.setBackgroundColor(Color.LTGRAY);
                            break;
                        case 9:
                            nine.setTextColor(Color.BLUE);
                            nine.setAllCaps(true);
                            nine.setBackgroundColor(Color.LTGRAY);
                            break;
                    }

                }
            }
        });
    }
}