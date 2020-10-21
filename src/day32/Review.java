package day32;

import java.util.Arrays;

public class Review {
    public static void main(String[] args) {
        //System.out.println(isTest());
        boolean[] testBooleanArray = new boolean[10];
        //System.out.println(Arrays.toString(testBooleanArray));
        whyNotReturnType();
    }

    private static void whyNotReturnType() {
        int a = 5;
        int b = a;
        b = b + 3;
        System.out.println("b = " + b);
        System.out.println("a = " + a);
        int[] arrayX = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] arrayY = arrayX;
        int[] arrayZ = arrayX;
        arrayY[0] = arrayY[0] + 10;
        System.out.println("arrayY[0] = " + arrayY[0]);
        System.out.println("arrayX[0] = " + arrayX[0]);
        System.out.println(arrayX);
    }

    public static boolean isTest() {
        boolean result = false;


        return result;
    }
}
