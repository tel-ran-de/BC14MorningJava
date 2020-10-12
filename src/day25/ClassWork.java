package day25;

public class ClassWork {
    public static void main(String[] args) {
        //Return the number of even ints in the given array.
        // Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
       /* int[] count1 = new int[]{2, 1, 2, 3, 4};
        int[] count2 = new int[]{2, 2, 0};
        int[] count3 = new int[]{1, 3, 5};
        System.out.println(countEvens(count1));//3
        System.out.println(countEvens(count2));//3
        System.out.println(countEvens(count3));//0*/
//Return the sum of the numbers in the array, returning 0 for an empty array.
// Except the number 13 is very unlucky, so it does
//not count and numbers that come immediately after a 13 also do not count.
        /*int[] arr1 = new int[]{1, 2, 2, 1};
        int[] arr2 = new int[]{1, 1};
        int[] arr3 = new int[]{1, 2, 2, 1, 13};
        int[] arr4 = new int[]{1, 2, 2, 1, 13, 15, 15};

        System.out.println(sum13(arr1));// → 6
        System.out.println(sum13(arr2));// → 2
        System.out.println(sum13(arr3));// → 6
        System.out.println(sum13(arr4));// → 21*/

        //Given an array of ints, return true if the array contains no 1's and no 3's.
        int[] arrr1 = new int[]{0, 2, 4};
        int[] arrr2 = new int[]{1, 2, 3};
        int[] arrr3 = new int[]{1, 2, 4};

        System.out.println(lucky13(arrr1));// → true
        System.out.println(lucky13(arrr2));// → false
        System.out.println(lucky13(arrr3));// → false
    }

    private static boolean lucky13(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 || arr[i] == 3) {
                return false;
            }
        }
        return true;
    }

    private static int sum13(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 13 || (i > 0 && arr[i - 1] == 13)) {
                continue;
                //break;
                //return 0;
            } else {
                sum = sum + arr[i];
            }

        }
        return sum;
    }

    private static int countEvens(int[] number) {
        int count = 0;
        for (int j : number) {
            if (j % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private static void myPrint(int[] input) {
        for (int element : input) {
            System.out.print(element + " ");

        }
        System.out.println();
    }


}
