public class Main {
    public static void main(String[] args) {
        boolean gameOver = true ;
        int score = 800;
        int leverCompleted = 5;
        int bonus=100;

        if (gameOver) {
            int finalScore = score + (leverCompleted * bonus);
            System.out.println("your final score was " + finalScore );
        }
        score = 10000;
        leverCompleted = 8;
        bonus = 200;
        if (gameOver) {
            int finalScore = score + (leverCompleted * bonus);
            System.out.println("your final score was " + finalScore );
        }


        score = 200 ;
        if (score>=5000){
            System.out.println("Your score is >=5000");
        } else if ((score<1000)&&(score>=500)) {
            System.out.println("Your score is <1000 and >=500");
        } else {
            System.out.println("Your score was <500 ");
        }

    }
}