package com.example.brian.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import static android.R.attr.host;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import static com.example.brian.quiz.R.id.wildlife;

public class Main9Activity extends AppCompatActivity {

    TabHost Tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        Main4Activity x = new Main4Activity();



        Tabs = (TabHost) findViewById(R.id.Tabthot);
        Tabs.setup();

        //Section one
        TabHost.TabSpec name = Tabs.newTabSpec("");
        name.setContent(R.id.tab1);///you want to display tab1 uder XML
        name.setIndicator("Game Over");
        Tabs.addTab(name);

        TextView displayName=(TextView)findViewById(R.id.displayName);
        displayName.setText("Well Done!!!. "+Main3Activity.myname);

        TextView Marks=(TextView)findViewById(R.id.ScoreDisplay);
        Marks.setText("Music Category!.");
        Marks.setText("Your Score: "+Main7Activity.score);




        //Section two

        name = Tabs.newTabSpec("");
        name.setContent(R.id.tab2);///you want to display tab2 uder XML
        name.setIndicator("Results OverView");
        Tabs.addTab(name);

        TextView makeoverview=(TextView)findViewById(R.id.OverView);

        makeoverview.setText("\nWhos is the king of Pop.... : Micheal Jackson\nwhich of the following Brand belong to Birdman?....: Cash Modney Records." +
                "\n" +
                "\nWhich of the following artist shes known  the R'n'b best female singer ever?...: Marry J.Blidge." +
                "\n"+
                "\nWhich of the following Female artist has won Best Female Rapper in the BET awards in last 5 years in a row....:Niki Minaj." +
                "\n"+
                "\nBoys 2 Man their known as the one of best male group, Which of the following HIT put them on the map in the early 80s?...:End of the Road." +
                "\n"+
                "\nWhat Bonny and clide refer to which two artits?...:Jayz and Beyonce." +
                "\n" +
                "\nUsher sang My boo, but which artits He featured on that track?...:Alicia Keys." +
                "\n"+
                "\nWhich of the following artist He known as 'Chommie ya  Bana'?...:Mdu." +
                "\n"+
                "\nWho sang Nkalankata...:Mandoza." +
                "\n"+
                "\nWho is the  hip-Hop singer who is known as Birdman's son?...:Lil Wayne.");










    }
}