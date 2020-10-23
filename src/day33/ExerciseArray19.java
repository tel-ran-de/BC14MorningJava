package day33;

import java.util.Arrays;

public class ExerciseArray19 {
    public static void main(String[] args) {

       /* int[] arr = new int[]{6, 2, 5, 3};
        int[] arr1 = new int[]{1, 2,};
        int[] arr2 = new int[]{1};*/
     /*   String resultFromArr = Arrays.toString(shiftLeft(arr));
        System.out.println(resultFromArr);// → [2, 5, 3, 6]
        System.out.println(Arrays.toString(shiftLeft(arr1)));// → [2, 1]
        System.out.println(Arrays.toString(shiftLeft(arr2)));// → [1]*/

        int[] arr = new int[]{2, 4, 1, 2};
        int[] arr1 = new int[]{4, 1, 4, 2};
        int[] arr2 = new int[]{4, 4, 1, 2, 3};
        System.out.println(Arrays.toString(post4(arr)));// → [1, 2
        System.out.println(Arrays.toString(post4(arr1)));// → [2]
        System.out.println((Arrays.toString(post4(arr2))));// → [1, 2, 3]
    }

    private static int[] post4(int[] input) {
        // 1 Findelast 4;
        // 2 Finde output array length
        // 2.5 Create output array
        // 3 Fill new output array
        int indexFor = 0;
        for (int i = input.length - 1; i >= 0; i--) {
            if (input[i] == 4) {
                indexFor = i;
                break;
            }
        }
        // 1. done
        int size = input.length - indexFor - 1;
        // 2. done
        int[] output = new int[size];
        // 2.5. done
        /* for (int i = size - 1; i >= 0; i--) {
            output[i] = input[input.length + i - size];
        }*/
        for (int i = 0; i < size; i++) {
            output[i] = input[i + indexFor + 1];
        }
        // 3. done
        return output;
    }

    private static int[] shiftLeft(int[] input) {
        int[] output = new int[input.length];
        for (int i = 1; i < input.length; i++) {
            output[i - 1] = input[i];
        }
        output[input.length - 1] = input[0];
        return output;
    }

    private static int[] reverse(int[] input) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[output.length - 1 - i] = input[i];
        }
        return output;
    }
}
