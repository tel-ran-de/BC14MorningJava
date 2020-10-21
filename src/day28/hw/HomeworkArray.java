package day28.hw;

public class HomeworkArray {
    public static void main(String[] args) {
        int[] span1 = new int[]{1, 2, 1, 1, 3};
        int[] span2 = new int[]{1, 4, 2, 1, 4, 1, 4};
        int[] span3 = new int[]{1, 4, 2, 1, 4, 4, 4};
        System.out.println(maxSpan(span1));// → 4
        System.out.println(maxSpan(span2));// → 6
        System.out.println(maxSpan(span3));// → 6
    }

    private static int maxSpan(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;

        }

        return count - 1;
    }
}
