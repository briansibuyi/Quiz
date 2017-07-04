package com.example.brian.quiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main4Activity extends AppCompatActivity {

    private ImageView wildlife;
    private  ImageView Cars;
    private  ImageView Music;
    private Button myexit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        wildlife = (ImageView) findViewById(R.id.wildlife);
        Cars = (ImageView) findViewById(R.id.cars);
        Music = (ImageView) findViewById(R.id.music);
        myexit  = (Button) findViewById(R.id.exit);

        wildlife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(Main4Activity.this);
                dialog.setTitle("How To Play");
                dialog.setMessage("Thank you for choosing the Wild animal Quiz section, this section consists of Question based on animal live the Jungle, Desert and water. This animal are part of our lives and we Need to know about them. Best of Luck to You on the quiz!!."
                );


                dialog.setPositiveButton("Start Quiz", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent wildLifeQuiz = new Intent(Main4Activity.this, Main6Activity.class);
                        startActivity(wildLifeQuiz);
                        dialog.dismiss();

                    }
                });

                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();
                    }
                });

                dialog.show();

            }
        });


        Cars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    AlertDialog.Builder dialog = new AlertDialog.Builder(Main4Activity.this);
                    dialog.setTitle("How To Play");
                    dialog.setMessage("Welcome the Life in the FastLane Section, this section consists of Question based on Cars, the thrill of the ride, the sound of peformance in the exhates  and the monster behide wheel. Answer the following Quiz and Best of luck to you!!."
                    );


                    dialog.setPositiveButton("Start Quiz", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent CarQuiz = new Intent(Main4Activity.this, Main5Activity.class);
                            startActivity(CarQuiz);
                            finish();
                        }
                    });

                    dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            dialog.dismiss();
                        }
                    });

                    dialog.show();

                }
            }
        });

        Music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    AlertDialog.Builder dialog = new AlertDialog.Builder(Main4Activity.this);
                    dialog.setTitle("How To Play");
                    dialog.setMessage("Welcome to Music Section, Music we don't just listen to it,we feel it. The beat of the sound it bests on our heart,mind, soul and we love it. This section consists of Music Quiz. answer all Question and best of luck to you!!."
                    );


                    dialog.setPositiveButton("Start Quiz", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent CarQuiz = new Intent(Main4Activity.this, Main7Activity.class);
                            startActivity(CarQuiz);
                            dialog.dismiss();

                        }
                    });

                    dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });

                    dialog.show();

                }
            }
        });

        myexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Main4Activity.this, Main2Activity.class);
                startActivity(a);
                finish();
            }
        });
    }
}