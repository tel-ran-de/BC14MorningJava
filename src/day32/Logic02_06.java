package day32;

public class Logic02_06 {
    public static void main(String[] args) {
        System.out.println(luckySum(1, 2, 3)); //→ 6
        System.out.println(luckySum(1, 2, 13)); // → 3
        System.out.println(luckySum(1, 13, 3)); //→ 1
    }

    private static int luckySum(int a, int b, int c) {
        int sum = a + b + c;
        if (a == 13) sum = 0;
        if (b == 13) sum = a;
        if (c == 13) sum = a + b;
        return sum;
    }
}
