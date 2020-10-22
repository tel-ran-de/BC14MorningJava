package day30;

public class Classwork_BubbleSort {
    public static int[] main(String[] args) {

        int[] array = new int[]{100, 45, 1, 38, 56, 75};
        return array;
    }

    public static int[] bubbleSortFind(int[] arrUnsort) {
        int count = 0;
        for (int i = 0; i < arrUnsort.length - 1; i++) {
            if (arrUnsort[i] > arrUnsort[i] + 1) {
                int temp = arrUnsort[i];
                arrUnsort[i] = arrUnsort[i + 1];
                arrUnsort[i + 1] = temp;
                count++;
            }
            if (count > 0) {
                bubbleSortFind(arrUnsort);
            }
        }
        return arrUnsort;
    }

}


