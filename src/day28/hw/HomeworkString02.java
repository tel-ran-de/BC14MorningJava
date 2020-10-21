package day28.hw;

import static day06.Classwork2.split;

public class HomeworkString02 {
    public static void main(String[] args) {
        System.out.println(catDog("catdog"));// → true
        System.out.println(catDog("catcat"));// → false
        System.out.println(catDog("1cat1cadodog"));// → true
        split();
        System.out.println(xyzThere("abcxyz"));// → true
        System.out.println(xyzThere("abc.xyz"));// → false
        System.out.println(xyzThere("xyz.abc"));// → true
        split();
        System.out.println(mixString("abc", "xyz"));// → "axbycz"
        System.out.println(mixString("Hi", "There"));// → "HTihere"
        System.out.println(mixString("xxxx", "There"));// → "xTxhxexre"
    }

    private static String mixString(String str1, String str2) {
        String output = "";
        int min = Math.min(str1.length(), str2.length());
        for (int i = 0; i < min; i++) {
            output = output + str1.charAt(i) + str2.charAt(i);

        } output = output + str2.substring(min);

        return output;

    }

    private static boolean xyzThere(String s1) {
        String xyz = "xyz";
        int index = s1.indexOf(xyz);
        char dot = '.';
        for (int i = 0; i < s1.length(); i++) {
            if (index == 0) {
                return true;
            }
            if (s1.charAt(index - 1) == dot) {
                return false;
            }

        }
        return true;
        /*if (index == 0) {
            return true;
        } else if (index - 1 == dot) {
            return false;
        }else {
            return true;
        }*/
    }


    private static boolean catDog(String word) {
        String cat = "cat";
        String dog = "dog";
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.contains(cat)) {
                count1++;
            }
            if (word.contains(dog)) {
                count2++;
            }
        }
        return count1 == count2;

    }
}
