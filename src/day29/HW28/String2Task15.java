package day29.HW28;

public class String2Task15 {
    public static void main(String[] args) {
/* Return true if the string “cat” and “dog” appear
the same number of times in the given string.  */

        System.out.println(catDog("catdog")); //→ true
        System.out.println(catDog("catcat")); //→ false
        System.out.println(catDog("1cat1cadodog")); //→ true

    }

    private static boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.contains("cat")) {
                catCount++;
            }
            if (str.contains("dog")) {
                dogCount++;
            }
            if (dogCount != catCount) {
                return false;
            }
        }
        return true;
    }
}

