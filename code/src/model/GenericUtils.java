package model;

/**
 * This class focuses on the usage of generic methods.
 * @author Akhmadov Khasu
 * @version 2025-04-03
 */
public class GenericUtils {

    /**
     *This method takes an array of a generic type and reverses
     * the order of the element.
     * @param array An Generic-Array that is supposed to be switched.
     * @param <T> Defines the type parameter for the parameter.
     */
    public static <T> void reverse(T[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // Swap elements at left and right indices
            T temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move indices towards the center
            left++;
            right--;
        }
    }

    /**
     * This method takes a Generic-Array bounded to a type, which
     * derives from the class Number and calculates the sum of the
     * elements.
     * @param array A Generic-Array which is bounded as a type from Number.
     * @return Returns the sum of all the elements within the Generic-Array.
     * @param <T> Defines the type parameter for the parameter. The type parameter is
     *           bounded as a type from Number.
     */
    public static <T extends Number> double sum(T[] array) {
        if (array == null || array.length == 0) {
            return 0.0;
        }

        double total = 0.0;
        for (T element : array) {
            total += element.doubleValue();
        }
        return total;
    }
}
