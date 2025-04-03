package model;

import java.util.Arrays;

/**
 * A class for testing the methods from the class GenericUtils.java
 * @author Akhmadov Khasu
 * @version 2025-04-03
 */
public class Main {
    public static void main(String[] args) {
        Integer[] array1 = {
                1, 2, 3, 4, 5, 6, 7, 8, 9,
                10, 11, 12, 13, 14, 15, 16,
                17, 18, 19, 20, 21, 22, 23, 24
        };
        System.out.println("Normal Integer-Array: "+ Arrays.toString(array1));
        GenericUtils.reverse(array1);
        System.out.println("Reversed Array: "+ Arrays.toString(array1));

        String[] array2 = {
                "A", "B", "C", "D", "E", "F"
        };
        System.out.println("Normal String-Array: "+ Arrays.toString(array2));
        GenericUtils.reverse(array2);
        System.out.println("Reversed Array: "+ Arrays.toString(array2));

        System.out.println("array1 sum: "+GenericUtils.sum(array1));
    }
}
