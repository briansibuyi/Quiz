package com.example.brian.quiz;

/**
 * Created by Brian on 2017/06/23.
 */

public class Cars {

    public String[] Questions = {
            "What is the most fastest car in the world?.",
            "What Define the word Coupe` in a car model?.",
            "Which of the following Cars known as THE CHERRY of gods?.",
            "If a car has the Toque, which of the following is likely to perform better?.",
            "Which one of this car brand belong to Volkswagen Group?.",
            "What is the safest car in the world?.",
            "Which the following invented the automobile?.",
            "Which Car Broke the sound Barrier early in the 80s?.",
            "Which Car Won the world genius record in 2014?.",
            "Which country made the Vehicle Devel Sixteen Concepts?.",


    };

    public String[][] possibleAnswer = {
            {"Nisaan SLR","SLS roadster","Devel Sixteen Concepts","burgatti Veron Sport"},
            {"Two seats","Pioramic roof","Xenon Lights","Two doors"},
            {"Dodge Challenger","Mugstang GT","Dodge Viper","Chevrolet  Cameros SS"},
            {"Better ABS","More higher Speed","Fast acceleration","Better balance"},
            {"Lamboghini","Laxes","BMW","Ford"},
            {"Mercedez Benz","Volvo","Audi","BMW"},
            {"Astona Martin","Karl (Carl) Benz.","VW Group","Posche"},
            {"Bugatti Veron Sport","Mclaren P1","Koenigsegg-Agera R","Thrust SSC-a super-sonic"},
            {"Laxes LFA","Saleen","Honda Zona","Hennessey Venom_GT"},
            {"Dubai","South Africa","Brazil","America"},

    };

    public String[] correctAnswer = {
            "Devel Sixteen Concepts",
            "Two doors",
            "Mugstang GT",
            "Fast acceleration",
            "Lamboghini",
            "Volvo",
            "Karl (Carl) Benz.",
            "Thrust SSC-a super-sonic",
            "Hennessey Venom_GT",
            "Dubai",
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

