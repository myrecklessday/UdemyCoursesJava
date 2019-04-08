public class Section3DatatypesOperators {

    public static void main(String[] args) {

        System.out.println("Section3DatatypesOperators, Tim!");

        int myFirstNumber = (5 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        int differenceNumber = 1000 - myTotal;

        System.out.println("differenceNumber = " + differenceNumber);

        // int has a width of 32 (4 bytes)
        int myMinIntValue = -2_147_483_648;
        int myMaxIntValue = 2_147_483_647;

        //byte has a width of 8
        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        //short has a width of 16
        short myMinShortValue = -32768;
        short myMaxShortValue = 32767;
        short myNewShortValue = (short) (myMaxShortValue / 2);
        //long has a width of 64
        long myLongValue = 100L;

        long myNewLongValue = 50000L + 10L * (myMinByteValue + myMaxShortValue + myMinIntValue);
        System.out.println("myNewLongValue" + myNewLongValue);

        int myIntValue = 5 / 2;
        //float has a width of 32 (4 bytes)
        float myFloatValue = 5f / 3f;
        //double has a width of 64 (8 bytes)
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double poundsValue = 200d;
        double kilogramsValue = poundsValue * 0.45359237d;
        System.out.println(poundsValue + " pounds = " + kilogramsValue + " kilograms");
        double pi = 3.141_592_7d;

        //width of char is 16 (2 bytes)
        char myChar = 'D';
        char myChar2 = '\u00A9';
        System.out.println("myChar2 = " + myChar2);

        boolean myBoolean = true;
        boolean isMale = true;

        String myString = "This is a string";
        System.out.println("myString = " + myString);
        myString = myString + ", this is more.";
        System.out.println("myString = " + myString);
        myString = myString + "\u00A9 2019";
        System.out.println("myString = " + myString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);

        boolean isCar = false;
        if (isCar)
            System.out.println("Error");

        //ternary operator
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true");

        //challenge
        double var1 = 20d;
        double var2 = 80d;
        double result = (var1 + var2) * 25;
        System.out.println("ressult = " + result);
        double remainder = result % 40;
        System.out.println("remainder = " + remainder);
        if (remainder <= 20){
            System.out.println("Total was over the limit");
        }


    }
}
