package day31;

public class Exercise19_6 {
    public static void main(String[] args) {
        /*int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 3};
        int[] a3 = {1, 2, 3};
        int[] b1 = {2, 3, 10};
        int[] b2 = {2, 3, 5};
        int[] b3 = {2, 3, 3};
        System.out.println(matchUp(a1, b1));// → 2
        System.out.println(matchUp(a2, b2));// → 3
        System.out.println(matchUp(a3, b3));// → 2*/
      /*  System.out.println(modThree(2, 1, 3, 5));// → true
        System.out.println(modThree(2, 1, 2, 5));// → false
        System.out.println(modThree(2, 4, 2, 5));// → true*/
        int[] arr1 = {5, 6, 45, 99, 13, 5, 6};
        int[] arr2 = {5, 6, 45, 99, 13, 5, 6};
        int[] arr3 = {5, 6, 45, 99, 13, 5, 6};
        int[] arr4 = {1, 2, 3, 5, 6, 7, 1, 2, 3};

        System.out.println(sameEnds(arr1, 1));// → false
        System.out.println(sameEnds(arr2, 2));// → true
        System.out.println(sameEnds(arr3, 3));// → false
        System.out.println(sameEnds(arr4, 3));// → true
    }

    private static boolean sameEnds(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] != arr[arr.length - n + i]) {
                return false;
            }
        }
        return true;
    }

    private static boolean modThree(int... args) {
        for (int i = 1; i < args.length - 1; i++) {
            if (args[i] % 2 == 1 && args[i + 1] % 2 == 1 && args[i - 1] % 2 == 1) {
                return true;
            }
            if (args[i] % 2 == 0 && args[i + 1] % 2 == 0 && args[i - 1] % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    private static int matchUp(int[] num1, int[] num2) {
        int count = 0;
        for (int i = 0; i < num1.length; i++) {
            int diff = Math.abs(num1[i] - num2[i]);
            if (diff == 2 || diff == 1) {
                count++;
            }
        }
        return count;
    }

}
