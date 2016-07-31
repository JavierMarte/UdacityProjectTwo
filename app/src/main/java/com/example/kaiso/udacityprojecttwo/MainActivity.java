package com.example.kaiso.udacityprojecttwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView teamOne;
    TextView teamTwo;
    int x = 0;
    int y = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamOne = (TextView) findViewById(R.id.textView3);
        teamTwo = (TextView) findViewById(R.id.textView4);
    }
    public void team1one(View view){
        x++;
        teamOne.setText("score =" + Integer.toString(x));
    }
    public void team1two(View view){
        x = x + 2;
        teamOne.setText("score =" + Integer.toString(x));
    }
    public void team1three(View view){
        x = x + 3;
        teamOne.setText("score =" + Integer.toString(x));
    }
    public void team1four(View view){
        x = x + 6;
        teamOne.setText("score =" + Integer.toString(x));
    }
    public void team2one(View view){
        y = y + 1;
        teamTwo.setText("score =" + Integer.toString(y));
    }
    public void team2two(View view){
        y = y + 2;
        teamTwo.setText("score =" + Integer.toString(y));
    }
    public void team2three(View view){
        y = y + 3;
        teamTwo.setText("score =" + Integer.toString(y));
    }
    public void team2four(View view){
        y = y + 6;
        teamTwo.setText("score =" + Integer.toString(y));
    }

    public void reset(View view){
        y = 0;
        x = 0;
    }

}
