package com.example.brian.quiz;

/**
 * Created by Brian on 2017/06/23.
 */

public class Music {

    public String[] Questions = {
            "Whos is the king of Pop?.",
            "which of the following Brand belong to Birdman?." ,
            "Which of the following artist shes known  the R'n'b best female singer ever?.",
            "Which of the following Female artist has won Best Female Rapper in the BET awards in last 5 years in a row.",
            "Boys 2 Man their known as the one of best male group, Which of the following HIT put them on the map in the early 80s?.",
            "What Bonny and clide refer to which two artits?.",
            "Usher sang My boo, but which artits He featured on that track?." ,
            "Which of the following artist He known as 'Chommie ya  Bana'?.",
            "Who sang Nkalankata." ,
            "Who is the  hip-Hop singer who is known as Birdman's son?.",


    };

    public String[][] possibleAnswer = {
            {"Usher","TI","Luther Vandross","Micheal Jackson"},
            {"Younng Money Records","Maybanch Music","Cash Modney Records","Toxic Records"},
            {"Beyonce","Marry J.Blidge","Tony Braxton","Lady Gaga"},
            {"Missy Eliot","EVE","Niki Minaj","Trina"},
            {"I would make love to You","Dance whith my father","End of the Road","U remind me"},
            {"R.kelly and Celin dion","Chris Brown and Rihanna","Akon and Captain Loner","Jayz and Beyonce"},
            {"M.J Blidge","Adele","Alicia Keys","Brandy"},
            {"Auther","Spikiri","Casper","Mdu"},
            {"Dj Bongs","Troppies","Mandoza","Pro Kid"},
            {"Rich hommie quan","Young Thug","Lil Wayne","Drake"},

    };

    public String[] correctAnswer = {
            "Micheal Jackson",
            "Cash Modney Records",
            "Marry J.Blidge",
            "Niki Minaj",
            "End of the Road",
            "Jayz and Beyonce",
            "Alicia Keys",
            "Mdu",
            "Mandoza",
            "Lil Wayne",
    };

    public String getQuestions(int x) {
        String question = Questions[x];
        return question;
    }

    public String getPossibleAnswer1(int x) {
        String answer1 = possibleAnswer[x][0];
        return answer1;
    }

    public String getPossibleAnswer2(int x) {
        String answer1 = possibleAnswer[x][1];
        return answer1;
    }

    public String getPossibleAnswer3(int x) {
        String answer1 = possibleAnswer[x][2];
        return answer1;
    }

    public String getPossibleAnswer4(int x) {
        String answer1 = possibleAnswer[x][3];
        return answer1;
    }

    public String getCorrectAnswer(int x) {
        String cAnswer = correctAnswer[x];
        return cAnswer;
    }
}
