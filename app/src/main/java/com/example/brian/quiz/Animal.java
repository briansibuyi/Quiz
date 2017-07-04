package com.example.brian.quiz;

/**
 * Created by Brian on 2017/06/23.
 */

public class Animal {

    public String[] Questions = {
            "What is the most fastest animal in the world?.",
            "Which of the following Considerd Omnivous?",
            "Which of the following spcicies cosindered KING on the Sea/Ocean?.",
            "Which animal can burn the land by running?",
            "Which animal can breath both in the water and land?",
            "Which one of the animal is the lowest when walking?.",
            "What Define a insect?.",
            "which of the following animal has long legs and junps around?.",
            "what is the tallest animal to the following?.",
            "Which of the following species can change to any color to its surrounding Environment?",


    };

    public String[][] possibleAnswer = {
            {"Cheater","Leapard","Lion","Hyhena"},
            {"Girraf","Elephant","Impala","Pig"},
            {"Chrocodile","Shark","Wale","Sea Lion"},
            {"Buffalo","Zenbra","Giraff","Octapus"},
            {"Sea Lion","Wale","Fish","Dog"},
            {"toitos","Chamelion","Rat","Snake"},
            {"Bird","bettle","Ant","Frog"},
            {"Impala","Zebra","Mockey","kangaroo"},
            {"Elaphant","Wale","Giraff","Dog"},
            {"Bird","Amuba","Octapus","Chamelion"},

    };

    public String[] correctAnswer = {
            "Cheater",
            "Pig",
            "Shark",
            "Zenbra",
            "Sea Lion",
            "Chamelion",
            "Ant",
            "kangaroo",
            "Giraff",
            "Chamelion",
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
