package day30;

public class Array2Task7 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 1, 3, 5};
        int[] arr2 = new int[]{2, 1, 2, 5};
        int[] arr3 = new int[]{2, 4, 2, 5};
        System.out.println(modThree(arr1)); //→ true
        System.out.println(modThree(arr2)); //→ false
        System.out.println(modThree(arr3)); //→ true
    }

    private static boolean modThree(int[] input) {
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) ;
        }

        return false;
    }
}
