package com.example.brian.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import static android.R.attr.country;
import static android.R.attr.host;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import static com.example.brian.quiz.R.id.wildlife;

public class Main10Activity extends AppCompatActivity {

    TabHost Tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        Main4Activity x = new Main4Activity();



        Tabs = (TabHost) findViewById(R.id.Tabthot);
        Tabs.setup();

        //Section one
        TabHost.TabSpec name = Tabs.newTabSpec("");
        name.setContent(R.id.tab1);
        name.setIndicator("Game Over");
        Tabs.addTab(name);

        TextView displayName=(TextView)findViewById(R.id.displayName);
        displayName.setText("Well Done!!!. "+Main3Activity.myname);

        TextView Marks=(TextView)findViewById(R.id.ScoreDisplay);
        Marks.setText("Car Category!.");
        Marks.setText("Your Score: "+Main5Activity.score);




        //Section two
        name = Tabs.newTabSpec("");
        name.setContent(R.id.tab2);///you want to display tab2 uder XML
        name.setIndicator("Results OverView");
        Tabs.addTab(name);

        TextView makeoverview=(TextView)findViewById(R.id.OverView);

        makeoverview.setText("What is the most fastest car in the world?...:Devel Sixteen Concepts\n" +
                "\n"+
                "What Define the word Coupe` in a car model?...:Two doors\n" +
                "\n"+
                "\nWhich of the following Cars known as THE CHERRY of gods?...:Mugstang GT"+
                "\n"+
                "\nIf a car has the Toque, which of the following is likely to perform better?...:Fast acceleration" +
                "\n"+
                "\nWhich one of this car brand belong to Volkswagen Group?...:Lamboghini" +
                "\n"+
                "\nWhat is the safest car in the world?...:Volvo" +
                "\n"+
                "\nWhich the following invented the automobile?...:Karl (Carl) Benz" +
                "\n"+
                "\nWhich Car Broke the sound Barrier early in the 80s?...:Thrust SSC-a super-sonic" +
                "\n"+
                "\nWhich Car Won the world genius record in 2014?...:Hennessey Venom_GT" +
                "\n"+
                "\nWhich country made the Vehicle Devel Sixteen Concepts?...:Dubai");








    }
}