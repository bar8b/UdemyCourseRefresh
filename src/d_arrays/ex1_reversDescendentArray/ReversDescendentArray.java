package d_arrays.ex1_reversDescendentArray;


import java.util.Arrays;
import java.util.Random;

public class ReversDescendentArray {

    public static void main(String[] args) {

        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            Random r = new Random();
            array[i] = r.nextInt(100);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int [] newArray = new int [4];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[(array.length - 1) - i];

        }
        System.out.println(Arrays.toString(newArray));

    }
}
