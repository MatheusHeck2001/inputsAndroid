package com.example.atividade2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Candidatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candidatos);
        SortedMap<Integer, String> candidates = new TreeMap<Integer, String>();
        ArrayList<String> result = new ArrayList<>();

        findViewById(R.id.registerButton).setOnClickListener(
                new View.OnClickListener() {

                    EditText candidate = (EditText) findViewById(R.id.candidateName);
                    EditText vote = (EditText) findViewById(R.id.candidateVotes);

                    @Override
                    public void onClick(View v) {
                        String candidateName = candidate.getText().toString();
                        int candidateVote = Integer.parseInt(vote.getText().toString());
                        candidates.put(candidateVote, candidateName);
                        Log.i("Key, Value", String.valueOf(candidates.size()));
                    }

                }
        );
        //Set s = candidates.entrySet();
        Iterator i = candidates.keySet().iterator();

        while (i.hasNext()){
            int key = (Integer)i.next();
            String value = (String)candidates.get(key
            );

            result.add(value);
        }

        findViewById(R.id.submitButton).setOnClickListener(
                new View.OnClickListener() {

                    TextView first = (TextView) findViewById(R.id.first);
                    TextView second = (TextView) findViewById(R.id.second);
                    TextView third = (TextView) findViewById(R.id.third);
                    TextView fourth = (TextView) findViewById(R.id.fourth);
                    TextView fifth = (TextView) findViewById(R.id.fifth);
                    TextView sixth = (TextView) findViewById(R.id.sixth);
                    TextView seventh = (TextView) findViewById(R.id.seventh);
                    TextView eighth = (TextView) findViewById(R.id.eighth);


                    @Override
                    public void onClick(View v) {
                        Log.i("first", first.getText().toString());
                        Log.i("second", second.getText().toString());
                        Log.i("third", third.getText().toString());
                        Log.i("fourth", fourth.getText().toString());
                        Log.i("fifth", fifth.getText().toString());
                        Log.i("sixth", sixth.getText().toString());
                        Log.i("seventh", seventh.getText().toString());
                        Log.i("eigth", eighth.getText().toString());


                        first.setText(result.get(0));
                        first.setTextColor(Color.BLUE);

                        second.setText(result.get(1));
                        second.setTextColor(Color.GREEN);

                        third.setText(result.get(2));
                        third.setTextColor(Color.GRAY);

                        fourth.setText(result.get(3));
                        fourth.setTextColor(Color.GRAY);

                        fifth.setText(result.get(4));
                        fifth.setTextColor(Color.GRAY);

                        sixth.setText(result.get(5));
                        sixth.setTextColor(Color.GRAY);

                        seventh.setText(result.get(6));
                        seventh.setTextColor(Color.GRAY);

                        eighth.setText(result.get(7));
                        eighth.setTextColor(Color.GRAY);
                    }
                }
        );
    }
}