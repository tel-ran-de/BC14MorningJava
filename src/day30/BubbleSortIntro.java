package day30;

import day20.FillAndPrintIntArray;

public class BubbleSortIntro {
    public static void main(String[] args) {
        int[] array = new int[]{100, 45, 1, 38, 56, 75};
        // 100, 45
        // 45, 100, 1, 38,56,75
        // 100 , 1
        //45, 1, 100 ,38,56,75
        //100, 38
        // 45,1,38,100
        // 100, 56 - черепаха
        //45, 1,38,56,100, 75,
        // 100, 75
        //45, 1,38,56, 75, 100
        FillAndPrintIntArray.myPrintIntArray(array);
        //bubbleSortRecursion(array);
        bubbleSort(array);
        FillAndPrintIntArray.myPrintIntArray(array);
    }

    private static void bubbleSort(int[] array) {
        boolean unsorted = true;
/*        boolean sorted = false;
        while(!sorted){

        }*/
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    unsorted = true;
                }
            }
        }
    }

    public static void bubbleSortRecursion(int[] arrUnsort) {
        int count = 0;
        for (int i = 0; i < arrUnsort.length - 1; i++) {
            if (arrUnsort[i] > arrUnsort[i + 1]) {
                int temp = arrUnsort[i];
                arrUnsort[i] = arrUnsort[i + 1];
                arrUnsort[i + 1] = temp;
                count++;
            }
        }
        if (count > 0) {
            bubbleSortRecursion(arrUnsort);
        }
    }
}
