package day32;

public class Logic09_08 {
    public static void main(String[] args) {
        System.out.println(makeChocolate(4, 1, 9)); // → 4
        System.out.println(makeChocolate(4, 1, 10));// → -1
        System.out.println(makeChocolate(4, 1, 7));// → 2
        System.out.println(makeChocolate(5, 2, 15));// → 5
        System.out.println(makeChocolate(10, 1, 15));// → 10
        /*         We want make a package of goal kilos of chocolate.
        We have small bars (1 kilo each) and big bars (5 kilos each).
        Return the number of small bars to use, assuming we always use big bars before small bars.
        Return -1 if it can't be done.        */
    }

    private static int makeChocolate(int smallBars, int bigBars, int goal) {
        int nSmall = goal - bigBars * 5;
        if (nSmall <= smallBars) {
            return nSmall;
        }
        return -1;
    }

    private static int makeChocolateThree(int smallBars, int bigBars, int goal) {
        int result = goal;
        for (int i = 0; i < bigBars; i++) {
            if (result >= 0) {
                result -= 5;
            }
        }
        return result <= smallBars ? result : -1;
    }

    private static int makeChocolateSecond(int smallBars, int bigBars, int goal) {
        int rem = goal % 5;
        if (smallBars + (bigBars * 5) < goal) {
            return -1;
        } else if ((rem <= smallBars) && (goal - bigBars * 5 > 4)) {
            return rem + 5;
        } else if (rem <= smallBars) {
            return rem;
        } else {
            return -1;
        }
    }
}
