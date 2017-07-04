package com.example.brian.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    public Button btn;
    public EditText textIntry;
    public static String  myname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btn = (Button) findViewById(R.id.button1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textIntry = (EditText)findViewById(R.id.name);
                myname = textIntry.getText().toString();//converting to string

                if(textIntry.getText().toString().length() == 0){
                    textIntry.setError("Your name is required!");
                }else{

                    Toast.makeText(getApplicationContext(),"Hi "+myname,Toast.LENGTH_SHORT).show();

                    Intent myintent = new Intent(Main3Activity.this,Main4Activity.class);
                    startActivity(myintent);
                    finish();

                }


            }
        });
    }

}
