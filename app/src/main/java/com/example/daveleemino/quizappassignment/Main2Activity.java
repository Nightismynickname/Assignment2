package com.example.daveleemino.quizappassignment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import static com.example.daveleemino.quizappassignment.MainActivity.s;

public class Main2Activity extends AppCompatActivity {
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        if (s>50){
            ImageView img= (ImageView) findViewById(R.id.imageView3);
            img.setImageResource(R.drawable.happy);
        }
        else
        {
            ImageView img= (ImageView) findViewById(R.id.imageView3);
            img.setImageResource(R.drawable.angery);
        }
        result = (TextView)findViewById(R.id.score);

        String data = getIntent().getExtras().getString("Something");
        result.setText(data);

    }

    public void onBackPressed() {
        startActivity(new Intent(this, MainActivity.class));
    }
}

