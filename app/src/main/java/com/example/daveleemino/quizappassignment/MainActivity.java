package com.example.daveleemino.quizappassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static EditText ed1;
    public TextView tv1;
    public TextView tv2;
    public static TextView tv3;
    RadioButton a,b,c,d;
    Button bt,bt2;
    RadioGroup rg;
    public static int q,s;
    int q1,q2,q3,q4,q5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1= findViewById(R.id.name);
        tv1= findViewById(R.id.ques);
        tv2= findViewById(R.id.response);
        tv3= findViewById(R.id.score);
        rg= findViewById(R.id.optionGroup);
        a= findViewById(R.id.option1);
        b= findViewById(R.id.option2);
        c= findViewById(R.id.option3);
        d= findViewById(R.id.option4);
        bt= findViewById(R.id.next);
        bt2= findViewById(R.id.back);

        q=0;
        s=0;
    }
    public void quiz (final View v){
        switch (q){
            case 1:
            {
                bt2.setVisibility(View.VISIBLE);
                rg.setVisibility(View.VISIBLE);
                rg.clearCheck();
                tv2.setText("");
                tv3.setText("");
                a.setEnabled(true);
                b.setEnabled(true);
                c.setEnabled(true);
                d.setEnabled(true);
                bt.setText("Next");
                ed1.setEnabled(false);
                tv1.setText("In Information Technology, WWW stands for?");
                tv2.setText("Question 1 of 5");
                a.setText("World Wide Wisdom");
                b.setText("Wilde's Wide Website");
                c.setText("World Wide Web");
                d.setText("Wishing Water Well");
                break;
            }
            case 2:
            {
                tv1.setText("What is used to communicate from one city to another?");
                tv2.setText("Question 2 of 5");
                a.setText("WAN");
                b.setText("MAN");
                c.setText("LAN");
                d.setText("WOMAN");
                int radioidentity = rg.getCheckedRadioButtonId();
                RadioButton myradio = (RadioButton) findViewById(radioidentity);
                int idx = rg.indexOfChild(myradio);
                q1 = idx;
                System.out.print(idx + "q1\n"); //To check if value is correct
                rg.clearCheck();
                break;
            }
            case 3:
            {
                tv1.setText("Which of the following software is used to view web pages?");
                tv2.setText("Question 3 of 5");
                a.setText("Google Chrome");
                b.setText("Microsoft Word");
                c.setText("Spotify");
                d.setText("Adobe Illustrator");
                int radioidentity = rg.getCheckedRadioButtonId();
                RadioButton myradio = (RadioButton) findViewById(radioidentity);
                int idx = rg.indexOfChild(myradio);
                q2 = idx;
                System.out.print(idx + "q2\n"); //To check if value is correct
                rg.clearCheck();
                break;
            }
            case 4:
            {
                tv1.setText("Collection of 1024 Bytes?");
                tv2.setText("Question 4 of 5");
                a.setText("1TB");
                b.setText("1GB");
                c.setText("1MB");
                d.setText("1KB");
                int radioidentity = rg.getCheckedRadioButtonId();
                RadioButton myradio = (RadioButton) findViewById(radioidentity);
                int idx = rg.indexOfChild(myradio);
                q3 = idx;
                System.out.print(idx + "q3\n"); //To check if value is correct
                rg.clearCheck();
                break;
            }
            case 5:
            {
                tv1.setText("Which of the following is a storage device?");
                tv2.setText("Question 5 of 5");
                a.setText("Network Card");
                b.setText("Keyboard");
                c.setText("USB Audio Adapter");
                d.setText("Flash Drive");
                int radioidentity = rg.getCheckedRadioButtonId();
                RadioButton myradio = (RadioButton) findViewById(radioidentity);
                int idx = rg.indexOfChild(myradio);
                q4 = idx;
                System.out.print(idx + "q4\n"); //To check if value is correct
                rg.clearCheck();
                break;
            }
            case 6:
            {
                bt2.setVisibility(View.INVISIBLE);
                int radioidentity = rg.getCheckedRadioButtonId();
                RadioButton myradio = (RadioButton) findViewById(radioidentity);
                int idx = rg.indexOfChild(myradio);
                q5 = idx;
                System.out.print(idx + "q5\n"); //To check if value is correct
                bt.setText("Show Result");
                tv3.setText("Click to Continue");
                    bt.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            if (q1 == 2) {
                                s = 20;
                            }
                            if (q2 == 1) {
                                s = s + 20;
                            }
                            if (q3 == 0) {
                                s = s + 20;
                            }
                            if (q4 == 3) {
                                s = s + 20;
                            }
                            if (q5 == 3) {
                                s = s + 20;
                            }
                            Intent gotopage2 = new Intent(getApplicationContext(), Main2Activity.class);
                            String data2 = ed1.getText() + "'s final score is " + s + "%".toString();
                            gotopage2.putExtra("Something", data2);
                            startActivity(gotopage2);
                        }
                    });
                break;
            }
        }
    }

    public void quiz2(final View v){
        switch (q){
            case 1:
            {
                tv1.setText("In Information Technology, WWW stands for?");
                tv2.setText("Question 1 of 5");
                a.setText("World Wide Wisdom");
                b.setText("Wilde's Wide Website");
                c.setText("World Wide Web");
                d.setText("Wishing Water Well");
                break;
            }
            case 2:
            {
                tv1.setText("What is used to communicate from one city to another?");
                tv2.setText("Question 2 of 5");
                a.setText("WAN");
                b.setText("MAN");
                c.setText("LAN");
                d.setText("WOMAN");
                break;
            }
            case 3:
            {
                tv1.setText("Which of the following software is used to view web pages?");
                tv2.setText("Question 3 of 5");
                a.setText("Google Chrome");
                b.setText("Microsoft Word");
                c.setText("Spotify");
                d.setText("Adobe Illustrator");
                break;
            }
            case 4:
            {
                tv1.setText("Collection of 1024 Bytes?");
                tv2.setText("Question 4 of 5");
                a.setText("1TB");
                b.setText("1GB");
                c.setText("1MB");
                d.setText("1KB");
                bt.setText("Next");

                break;
            }
            case 5:
            {
                tv1.setText("Which of the following is a storage device?");
                tv2.setText("Question 5 of 5");
                a.setText("Network Card");
                b.setText("Keyboard");
                c.setText("USB Audio Adapter");
                d.setText("Flash Drive");
                bt.setText("Next");
                break;
            }
        }
    }

    public void backquiz(View v)
    {

            q = q - 1;

            quiz2(v);

    }
    public void runquiz(View v)
    {
        q= q + 1;
        quiz(v);
    }

}


