package day30;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] a = {7, 54, 3, 11, 17};
        int[] b = Arrays.copyOf(a, a.length);
        System.out.println(Arrays.toString(b));

        int[] c = new int[3];
        System.arraycopy(a, 2, c, 0, 3);
        System.out.println(Arrays.toString(c));

        // .clone() - clone array
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = arr1.clone();
        System.out.println("Cloned array: " + Arrays.toString(arr2));

        // Array.copyOf (array to be coppied, lenght) - simple copy
        int[] old = {1, 2, 3, 4, 12, 6, 7};
        int[] copiedArray = Arrays.copyOf(old, old.length);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));

        // System.arraycopy - detailed copy of array
        int[] before = {1, 4, 48, 97, 120, 6000, 7};
        int [] after = new int [10];
        System.arraycopy(before, 0, after, 2, 7);
        System.out.println("Detailed printed array: " + Arrays.toString(after));

        // Arrays.copyofRange
        int[] array = {23, 43, 55, 12, 65, 88, 92};
        int[] array2 = Arrays.copyOfRange(array, 1, 4);
        System.out.println(Arrays.toString(array2));




    }
}
