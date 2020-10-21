package day32;

/**
 * BC14MorningJava
 * 21 10 : 27
 */
public class AnotherReview {
    public static void main(String[] args) {
        int[] arr = createIntArray(10); // new int[]
        int[] arr2 = new int[10];
        test2(arr2);
    }

    private static void test2(int[] input) {
    }

    public static int[] createIntArray(int size) {
        int[] output = new int[size];
        for (int i = 0; i < size; i++) {
            output[i] = (int) (Math.random() * 100);
        }
        return output;
    }
}
