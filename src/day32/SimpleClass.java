package day32;


public class SimpleClass {
    public static void main(String[] args) {
        System.out.println(sum(1_999_999_999, 1_999_999_999));
        System.out.println(Integer.MAX_VALUE);
    }

    private static int sum(int a, int b) {
        assert (Integer.MAX_VALUE - a >= b) : "Value of " + a + " + " + b + " is too large to add.";
        final int output = a + b;
        assert (output - a == b) : "Sum of " + a + " + " + "returned wrong sum " + output;
        return output;
    }
}
