public class Main {
    public static void main(String[] args) {

        String myString = "This is a string" ;
        System.out.println("My string is equal to = " + myString);
        myString = myString + ", and this is more" ;
        System.out.println("My string is equal to = " + myString);

        String lastString = "10";
        int myInt = 50 ;
        lastString = lastString + myInt ;
        System.out.println("Last string is equal to = " + lastString);
        double mydouble = 125.32 ;
        lastString = lastString + mydouble ;
        System.out.println("Last string is equal to = " + lastString);
    }
}