package com.example.brian.quiz;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static android.R.attr.x;
import static android.R.attr.y;

public class Main7Activity extends AppCompatActivity {

    Button submit;
    TextView question;
    RadioButton answer1, answer2, answer3, answer4;
    TextView time;
    public static int score = 1;

    //Creating an objkect of a class
    Music quizObject = new Music();
    //Converting Array to a List
    List<String> questionList = Arrays.asList(quizObject.Questions);
    List<String[]> possibleList = Arrays.asList(quizObject.possibleAnswer);
    List<String> correctList = Arrays.asList(quizObject.correctAnswer);

    String myCorrectAnswer;
    //Variable to autoincrement
    int increamentVar = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        submit = (Button) findViewById(R.id.btnButton);

        answer1 = (RadioButton) findViewById(R.id.rad1);
        answer2 = (RadioButton) findViewById(R.id.rad2);
        answer3 = (RadioButton) findViewById(R.id.rad3);
        answer4 = (RadioButton) findViewById(R.id.rad4);
        question = (TextView) findViewById(R.id.text);
        time = (TextView) findViewById(R.id.timer);

        Time();
        shuffle();
        update(questionList.indexOf(questionList.get(increamentVar)));

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increamentVar++;

                if (increamentVar <=9) {
                    if (answer1.isChecked()) {
                        if (answer1.getText().toString().equalsIgnoreCase(myCorrectAnswer)) {
                            score++;

                        }
                        update(questionList.indexOf(questionList.get(increamentVar)));

                    } else if (answer2.isChecked()) {
                        if (answer2.getText().toString().equalsIgnoreCase(myCorrectAnswer)) {
                            score++;
                        }
                        update(questionList.indexOf(questionList.get(increamentVar)));

                    } else if (answer3.isChecked()) {
                        if (answer3.getText().toString().equalsIgnoreCase(myCorrectAnswer)) {
                            score++;
                        }
                        update(questionList.indexOf(questionList.get(increamentVar)));

                    } else if (answer4.isChecked()) {
                        if (answer4.getText().toString().equalsIgnoreCase(myCorrectAnswer)) {
                            score++;
                        }
                        update(questionList.indexOf(questionList.get(increamentVar)));
                    }
                    //Toast.makeText(getApplicationContext(), "" + score, Toast.LENGTH_SHORT).show();

                } else {
                    //Game Over
                    Intent myintent = new Intent(Main7Activity.this,Main9Activity.class);
                    startActivity(myintent);
                }
            }
        });

    }

    public void update(int num) {
        //Updating the question
        //Setting the question to the textView
        question.setText(quizObject.getQuestions(num));
        //Setting the Answers to the radioButtons
        answer1.setText(quizObject.getPossibleAnswer1(num));
        answer2.setText(quizObject.getPossibleAnswer2(num));
        answer3.setText(quizObject.getPossibleAnswer3(num));
        answer4.setText(quizObject.getPossibleAnswer4(num));
        //Setting the correct answer to a variable
        myCorrectAnswer = quizObject.getCorrectAnswer(num);
    }

    void shuffle() {
        //Shuffle the question
        long n = System.nanoTime();
        //Shuffles the List the same way and select the same number -- In order
        Collections.shuffle(questionList, new Random(n));
        Collections.shuffle(possibleList, new Random(n));
        Collections.shuffle(correctList, new Random(n));
    }



    //Time counter
    void Time(){
        new CountDownTimer(120000,1000){
            @Override
            public void onTick(long millisUntilFinished) {

                // setting up the time to start
                time.setText("Time :"+millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {

                //setting up the action when the time is finished
                Intent myintent = new Intent(Main7Activity.this,Main9Activity.class);
                startActivity(myintent);
            }


        }.start();
    }
}