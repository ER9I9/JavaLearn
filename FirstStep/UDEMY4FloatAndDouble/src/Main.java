public class Main {
    public static void main(String[] args) {
       float myminfloatvalue = Float.MIN_VALUE;
       float mymaxfloatvalue = Float.MAX_VALUE;
        System.out.println("Float MIN value = " + myminfloatvalue);
        System.out.println("Float MAX value = " + mymaxfloatvalue);
        double mymindoublevalue = Double.MIN_VALUE;
        double mymaxdoublevalue= Double.MAX_VALUE;
        System.out.println("Double MIN value = " + mymindoublevalue );
        System.out.println("Double MAX value = " + mymaxdoublevalue );



         int myIntValue = 5 / 3 ;
         float myFloatValue = 5f / 3f ;
         double myDoublevalue = 5d / 3d ;

        System.out.println("my INT value = "+ myIntValue);
        System.out.println("my FLOAT value = " + myFloatValue);
        System.out.println("my DOUBLE value = " + myDoublevalue);


        double pounds = 130d ;
        double kg = pounds * 0.45359237d ;
        System.out.println(pounds + " pounds = "+kg + " kg");

        double example = 3_000_000.5_444_777 ;
        System.out.println(example);
    }
}