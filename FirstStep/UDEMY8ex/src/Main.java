public class Main {
    public static void main(String[] args) {

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = ( myFirstValue + mySecondValue ) * 100.00d;
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("my total value = " + myValuesTotal );
        System.out.println("the remainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0 ) ? true : false ;
        System.out.println("isNoRemainder = "+ isNoRemainder);
        if(!isNoRemainder){
            System.out.println("got some remainder");
        }




    }
}