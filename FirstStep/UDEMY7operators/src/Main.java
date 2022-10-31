public class Main {
    public static void main(String[] args) {
        int topScore = 100 ;
        if (topScore == 100 ){
            System.out.println("you got the high score");
        }
        int secondtopscore = 60 ;
        if (topScore>secondtopscore && topScore<100){
            System.out.println("Greater than second score and less than 100");
        }

        boolean x = true ;
        if (x){
            System.out.println("this is true");
        }
        boolean y = false ;

        if (!y){
            System.out.println("this is false");
        }

        //ternary operator

        boolean isCar = true ;
        boolean wasCar = (isCar) ? true : false ;
        System.out.println(wasCar);

        int ageOfClient = 30;
        boolean isEighteenOrOver = (ageOfClient == 20) ? true : false ;
        //perand one -ageofclient ==20 in this case is the condition we are checking . it needs to return true or false
        //operand two -true here is the value to assign to the variable isEighteenOrOver if the condition above is true
        // operand three -false here is the value to assign to the variable isEighteenOrOver if the condition above was false
        System.out.println(isEighteenOrOver);
        int RR=50;
        int SS = (RR == 50)? 100 : 70 ;
        System.out.println(SS);
      /*
      if (condition1) {
            // block of code to be executed if condition1 is true
        } else if (condition2) {
            // block of code to be executed if the condition1 is false and condition2 is true
        } else {
            // block of code to be executed if the condition1 is false and condition2 is false
        }
        */


    }
}