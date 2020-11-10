package design.xcelr8;

public class Main {

    public static void main(String[] args){
	//write your code here

        //Example int value with MIN and MAX values printed
        //int = 32 bits (width of 32)
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        //Max and Min Values printed
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        //Max and Min value over and underflow in the commandline
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        //Another syntax for entering large numbers
        int myMaxIntTest = 2_147_483_647;

        //Example Byte data type with MIN and MAX values printed
        //Byte = 8 bits (Width of 8)
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        //Example Short data type with MIN and MAX values printed
        //short = 16 bits (width of 16)
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        
        //"l" or "L" needs to be added to the end of each long value when initialixed
        long myLongValue = 100L;
        //Example Long data type with MIN and MAX values printed
        //long = 64 bits (width = 64) //twice the width of an integer//
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);
    }
}
