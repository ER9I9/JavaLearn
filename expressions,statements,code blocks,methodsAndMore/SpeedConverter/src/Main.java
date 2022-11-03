public class Main {


    public static void main(String[] args) {

    long miles = toMilesPerHour(75.114);
        System.out.println(miles);
        printConversion(2.0);

    }


    public static long toMilesPerHour(double kilometersPerHour ){
        if (kilometersPerHour<0){
            return -1 ;
        } else {
            return Math.round(kilometersPerHour/1.609) ;
        }
    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour<0){
            System.out.println("Invalid Value");
        }else {
           long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println((double) kilometersPerHour+" km/h = "+milesPerHour+" mi/h");
        }
    }

}