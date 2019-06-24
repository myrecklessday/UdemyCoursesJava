package section_8_arrays_and_lists.arrays.arrays_min_element;
//
//-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
//        -The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
//        -Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
//        -In the main() method read the count from the console and call the method readIntegers() with the count parameter.
//        -Then call the findMin() method passing the array returned from the call to the readIntegers() method.
//        -Finally, print the minimum element in the array.
//        Tips:
//        -Assume that the user will only enter numbers, never letters

import java.util.Arrays;
import java.util.Scanner;

public class Min_Element {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        System.out.println(Arrays.toString(readIntegers(5)));

        System.out.println("Enter number of elements: \r");
        int count = scanner.nextInt();

        int[] myArray = readIntegers(count);
        System.out.println("Minimum element is " + findMin(myArray));

    }

    public static int[] readIntegers(int count){
        int[] enteredArray = new int[count];
        System.out.println("Enter " + count + " values:");
        for (int i = 0; i < count; i++){
            enteredArray[i] = scanner.nextInt();
        }
        return enteredArray;
    }

    public static int findMin(int[] array){

        // Solution 1
//        int min = array[0];
//
//        for (int i = 0; i < array.length; i++){
//            if (array[i] < min){
//                min = array[i];
//            }
//        }
//
//        return min;

        //Solution 2

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;

    }

}

