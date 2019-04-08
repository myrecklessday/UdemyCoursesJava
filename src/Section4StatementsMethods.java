public class Section4StatementsMethods {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args){

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score is " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score is " + highScore);

        int scorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Lena", scorePosition);
        scorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Ann", scorePosition);
        scorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Matt", scorePosition);
        scorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("James", scorePosition);

        //Method overloading example - unique method signature
        int newScore = calculateScore2("Lena", 500);
        System.out.println("New score is " + newScore);
        calculateScore2(75);
        calculateScore2();

        double cm = calcFeetAndInchesToCentimeters(6,-1);

        if (cm < 0.0)
            System.out.println("Invalid parameters");

        calcFeetAndInchesToCentimeters(157);

        //Method overloading challenge
        System.out.println(getDurationString(65, 9));
        System.out.println(getDurationString(3660));
        System.out.println(getDurationString(-25));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position " +
                position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score){
//        if (score >= 1000){
//            return 1;
//        } else if (score >= 500){
//            return 2;
//        } else if (score >= 100){
//            return 3;
//        }
//
//        return 4;
        int position = 4;
        if (score >= 1000){
            position = 1;
        } else if (score >= 500){
            position = 2;
        } else if (score >= 100){
            position = 3;
        }
        return position;
    }

    public static int calculateScore2(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore2(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore2(){
        System.out.println("No player name, no player score");
        return 0;
    }

    //Method overloading example
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        double cm;
        if ((feet < 0) || (inches < 0) || (inches > 12)){
            return -1;
        }
        cm = 2.54 * inches + 12 * feet * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + cm + " cm");
        return cm;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0){
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

    //Method overloading challenge
    public static String getDurationString(int minutes, int seconds){
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)){
            return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        String hoursString = hours + " h ";
        if (hours < 10){
            hoursString = "0" + hoursString;
        }
        String minutesString = remainingMinutes + " m ";
        if (remainingMinutes < 10){
            minutesString = "0" + minutesString;
        }
        String secondsString = seconds + " s ";
        if (seconds < 10){
            secondsString = "0" + secondsString;
        }
         return hoursString + minutesString + secondsString;
    }

    public static String getDurationString(int seconds){
        if (seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = seconds / 60;
        seconds %= 60;
        return getDurationString(minutes, seconds);
    }


}
