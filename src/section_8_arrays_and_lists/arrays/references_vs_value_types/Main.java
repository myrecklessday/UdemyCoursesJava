package section_8_arrays_and_lists.arrays.references_vs_value_types;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        //myIntArray is a reference to the array in memory
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));

        anotherArray = new int[] {4, 5, 6, 7, 8};
        modifyArray(myIntArray);

        System.out.println("after modify myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after modify anotherArray = " + Arrays.toString(anotherArray));

        System.out.println("address myIntArray = " + myIntArray);
        System.out.println("address anotherArray = " + anotherArray);
    }

    private static void modifyArray(int[] array){

        int[] newArray = array;
        array[0] = 2;
        System.out.println("address new array" + newArray);
        System.out.println("address array" + array);
        array = new int[] {1, 2, 3, 4, 5};
        System.out.println("address array" + array);
        System.out.println("address new array" + newArray);


    }

}
