package day31.varargs;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println(sum(2, 3));
        System.out.println(sum(4, 7));

        System.out.println(sumThre(2, 3, 4, 5));
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(sumForAdultCoder("Andrej", 1, 6, 100, 34));
    }

    private static int sumForAdultCoder(String name, int... varargs) {

        int sum = 0;
        for (int element : varargs) {
            sum += element;
        }
        return sum;
    }

    private static int sumThre(int i, int i1, int i2, int i3) {
        return i + i1 + i2 + i3;
    }

    private static int sum(int a, int b) {
        return a + b;
    }
}
