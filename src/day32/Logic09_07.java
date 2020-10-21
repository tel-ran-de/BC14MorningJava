package day32;

public class Logic09_07 {
    public static void main(String[] args) {
        System.out.println(closeFar(1, 2, 10)); // → true
        System.out.println(closeFar(1, 2, 3)); // → false
        System.out.println(closeFar(4, 1, 3)); // → true
    }

    private static boolean closeFar(int a, int b, int c) {
        int diff1, diff2, diff3;
        diff1 = Math.abs(a - b);
        diff2 = Math.abs(a - c);
        diff3 = Math.abs(b - c);
        return diff1 <= 1 && diff2 >= 2 && diff3 >= 2
                || diff2 <= 1 && diff1 >= 2 && diff3 >= 2;
    }
}
