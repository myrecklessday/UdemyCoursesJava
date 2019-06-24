package section_8_arrays_and_lists.arrays.arrays_reverse_array;

//  -Write a method called reverse() with an int array as a parameter.
//        -The method should not return any value. In other words, the method is allowed to modify the array parameter.
//        -In main() test the reverse() method and print the array both reversed and non-reversed.
//        -To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
//        -For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Initial array: " + Arrays.toString(myArray));
        reverse(myArray);
        System.out.println("Reversed array: " + Arrays.toString(myArray));

    }

    private static void reverse(int[] array){

        int temp;
        int index = array.length / 2;
        int lastElementIndex = array.length - 1;

        for (int i = 0; i < index; i++){
            temp = array[i];
            array[i] = array[lastElementIndex - i];
            array[lastElementIndex - i] = temp;
        }

    }

}
