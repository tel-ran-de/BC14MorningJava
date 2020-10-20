package day31;

import java.util.Arrays;

public class CombSort {
    public static void main(String[] args) {
        int[] arr = CocktailSort.createIntArray(10);
        System.out.println(Arrays.toString(arr));
        int[] myCopy = new int[arr.length];
        System.arraycopy(arr, 0, myCopy, 0, arr.length);
        combSort(myCopy);
        System.out.println(Arrays.toString(myCopy));
    }

    private static void combSort(int[] arr) {
        final double stepConstant = 1.24733095;
        int step = arr.length;
        while (step > 1) {
            step = (int) (step / stepConstant);
            System.out.println(step + " step");
            for (int i = 0; step + i < arr.length; i++) {
                if (arr[i] > arr[i + step]) {
                    CocktailSort.swapTwoElementsInIntArray(arr, i, i + step);
                }
            }
        }
    }
}
