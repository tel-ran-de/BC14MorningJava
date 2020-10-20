package test1;

public class Test {
    public static void main(String[] args) {
        System.out.println(sum(1922222225, 1922222225));
    }

    // Calculates the sum of a (int) + b (int) and returns the result (int).
    public static int sum(int a, int b) {
        assert (Integer.MAX_VALUE - a >= b) : "Value of " + a + " + " + b + " is too large to add.";
        final int result = a + b;
        assert (result - a == b) : "Sum of " + a + " + " + b + " returned wrong sum " + result;
        return result;
    }
}