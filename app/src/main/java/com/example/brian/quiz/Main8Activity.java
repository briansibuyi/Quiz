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

public class Main8Activity extends AppCompatActivity {

    TabHost Tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

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

        Marks.setText("Your Score: "+Main6Activity.score);




        name = Tabs.newTabSpec("");
        name.setContent(R.id.tab2);///you want to display tab2 uder XML
        name.setIndicator("Results OverView");
        Tabs.addTab(name);

        TextView makeoverview=(TextView)findViewById(R.id.OverView);

        makeoverview.setText("\nWhat is the most fastest animal in the world?...:Cheater." +
                "\n"+
                "\nWhich of the following Considerd Omnivous?...:Pig." +
                "\n"+
                "\nWhich of the following spcicies cosindered KING on the Sea/Ocean?...:Shark." +
                "\n"+
                "\nWhich animal can burn the land by running?....Zenbra." +
                "\n"+
                "\n Which animal can breath both in the water and land?...:Sea Lion." +
                "\n"+
                "\nWhich one of the animal is the lowest when walking?....:Chamelion." +
                "\n"+
                "\nWhat Define a insect?...:Ant" +
                "\n"+
                "\nwhich of the following animal has long legs and junps around?...:kangaroo." +
                "\n"+
                "\nwhat is the tallest animal to the following?...:Giraff." +
                "\n"+
                "\nWhich of the following species can change to any color to its surrounding Environment?...:Chamelion.");








    }
}
