package HW28;

public class String02_15 {
    public static void main(String[] args) {
        System.out.println(catDog("catdog")); //→ true
        System.out.println(catDog("catcat")); // → false
        System.out.println(catDog("1cat1cadodog")); //→ true
        System.out.println(catDog("catdogcat")); //→ false
    }

    private static boolean catDog(String str) {
        int countCat = 0;
        int countDog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            String substring = str.substring(i, i+3);
            if (substring.equals("cat")) countCat++;
            if (substring.equals("dog")) countDog++;
        }
        return countCat == countDog;
    }
}
