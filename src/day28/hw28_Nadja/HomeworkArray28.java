package day28.hw28_Nadja;

public class HomeworkArray28 {

    public static void main(String[] args) {
        //Consider the leftmost and righmost appearances of some value in an array. We’ll say that the “span” is the number of elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)
        //
        int[] arr1 = {1, 2, 1, 1, 3};//4
        int[] arr2 = new int[]{1, 4, 2, 1, 4, 1, 4};//6
        int[] arr3 = new int[]{1, 4, 2, 1, 4, 4, 4};//6
        System.out.println(maxSpan(arr1));
        System.out.println(maxSpan(arr2));
        System.out.println(maxSpan(arr3));
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(maxSpan(arr));
    }

    //Consider the leftmost and righmost appearances of some value in an array.
    // We’ll say that the “span” is the number of elements between the two inclusive.
    // A single value has a span of 1. Returns the largest span found in the given array.
    // (Efficiency is not a priority.)
    private static int maxSpan(int[] arr) {

        int outputLength = 0;
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            int lengthArr = 0;
            int startLenght = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == element) {
                    lengthArr = j + 1 - startLenght;
                }
            }
            if (lengthArr > outputLength) outputLength = lengthArr;
        }
        return outputLength;
    }
}
