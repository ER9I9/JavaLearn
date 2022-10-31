public class Main {
    public static void main(String[] args) {
        byte myByteVar = 20 ;
        short myShortVar = 30_000;
        int myIntVar = 100_000;
        long myLongVar = 50000L + 10L *(myByteVar+myShortVar+myIntVar);
        System.out.println(myLongVar);

    }
}