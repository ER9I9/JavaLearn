public class Main {
    public static void main(String[] args) {

      //4 bytes
       int myMinIntValue = Integer.MIN_VALUE;
       int myMaxIntValue = Integer.MAX_VALUE;
       System.out.println("Integer minimum value = " + myMinIntValue);
       System.out.println("Integer maximum value = " + myMaxIntValue);

        //1 byte
       byte myMinBytevalue = Byte.MIN_VALUE;
       byte myMaxBytevalue = Byte.MAX_VALUE;
       System.out.println("Byte minimum value = " + myMinBytevalue);
       System.out.println("Byte maximum value = " + myMaxBytevalue);

        //2 bytes
       short myMinShortvalue = Short.MIN_VALUE;
       short myMaxShortvalue = Short.MAX_VALUE;
       System.out.println("Short minimum value = " + myMinShortvalue);
       System.out.println("Short maximum value = " + myMaxShortvalue);

        //8 bytes
        long myLongValue = 2_147_483_647_254L; //must put L in the end of a long number
       long myMinLongvalue = Long.MIN_VALUE;
       long myMaxLongvalue = Long.MAX_VALUE;
       System.out.println("Long minimum value = " + myMinLongvalue);
       System.out.println("Long maximum value = " + myMaxLongvalue);

       int myTotal = (myMinIntValue / 2);

       byte myNewByteValue = (byte) (myMinBytevalue / 2);

       short myNewShortValue = (short) (myMinShortvalue / 2);


    }
}