package com.example.atividade2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Imc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        findViewById(R.id.imcButton).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText weightEt = (EditText) findViewById(R.id.weightValue);
                        EditText heightEt = (EditText) findViewById(R.id.heightValue);

                        try {
                            double weight = Double.parseDouble(weightEt.getText().toString());
                            double height = Double.parseDouble(heightEt.getText().toString());
                            double imc = weight/(height*height);

                            TextView imcResult = findViewById(R.id.imcResult);
                            imcResult.setText(String.valueOf(imc));
                            TextView phrase = findViewById(R.id.resultPhrase);



                            if (imc < 20){
                                imcResult.setTextColor(Color.rgb(128, 0, 128));
                                phrase.setTextColor(Color.rgb(128, 0, 128));
                                phrase.setText("You're under weight.");
                            } else {
                                if (imc < 25){
                                    imcResult.setTextColor(Color.rgb(0,0,255));
                                    phrase.setTextColor(Color.rgb(0,0,255));
                                    phrase.setText("You're in weight.");
                                } else {
                                    imcResult.setTextColor(Color.rgb(255,0,0));
                                    phrase.setTextColor(Color.rgb(255,0,0));
                                    phrase.setText("You're overweight.");
                                }
                            }
                        }
                        catch (NumberFormatException e){
                            e.printStackTrace();
                        }
                    }
                }
        );
    }
}