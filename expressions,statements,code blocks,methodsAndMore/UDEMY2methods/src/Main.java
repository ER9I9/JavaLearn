public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculaateHighScorePosition(1500);
        displayHighScorePosition("slah ",highScorePosition);

        highScorePosition = calculaateHighScorePosition(900);
        displayHighScorePosition("ali ",highScorePosition);

        highScorePosition = calculaateHighScorePosition(400);
        displayHighScorePosition("oussema ",highScorePosition);

        highScorePosition = calculaateHighScorePosition(50);
        displayHighScorePosition("ayoub ",highScorePosition);

    }

    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }


    public static void displayHighScorePosition(String playerName , int highscorePosition){
        System.out.println(playerName + "managed to get into position " + highscorePosition + "on the highscore table");
    }

    public static int calculaateHighScorePosition(int playerScore){
        if (playerScore>=1000){
            return 1 ;
        } else if ((playerScore>=500)&&(playerScore<1000)) {
            return 2;
        } else if ((playerScore>=100)&&(playerScore<500)) {
            return 3;
        } else {
            return 4;
        }
    }


}
