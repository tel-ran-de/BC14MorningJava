package day28_homework_Olga;


import static day06.Classwork2.split;

public class HW {
    public static void main(String[] args) {
        System.out.println("String 01_16");
        //Given a string, return a version without
        //both the first and last char of the string.
        //The string may be any length, including 0.

        System.out.println(withoutEnd2("Hello"));// → "ell"
        System.out.println(withoutEnd2("abc"));// → "b"
        System.out.println(withoutEnd2("ab"));// → ""
        split();

        System.out.println("String 01_17");
        //Given a string and an int n,
        //return a string made of the first and last n chars from the string.
        //The string length will be at least n.
        System.out.println(nTwice("Hello", 2));// → "Helo"
        System.out.println(nTwice("Chocolate", 3));// → "Choate"
        System.out.println(nTwice("Chocolate", 1));// → "Ce"
        split();

        System.out.println("String 02_15");
        //Return true if the string “cat” and “dog” appear the same number
        //of times in the given string.
        //System.out.println(catDog("catdog"));// → true
        //System.out.println(catDog("catcat"));// → false
        //System.out.println(catDog("1cat1cadodog"));// → true
        split();

        System.out.println("String 02_15_1");

        System.out.println(count("catdog"));
        System.out.println(count("catcat"));
        System.out.println(count("1cat1cadodog"));
        split();

        System.out.println("String 02_16");

        //Return true if the given string contains an appearance of “xyz”
        //where the xyz is not directly preceeded by a period (.).
        //So “xxyz” counts but “x.xyz” does not.
        //Возвращает true, если данная String содержит появление «xyz»,
        //где перед xyz не ставится точка (.).
        //Таким образом, «xxyz» считается, а «x.xyz» - нет.

        System.out.println(xyzThere("abcxyz"));// → true
        System.out.println(xyzThere("abc.xyz"));// → false
        System.out.println(xyzThere("xyz.abc"));// → true
        System.out.println(xyzThere("x.xyz"));// → false
        System.out.println(xyzThere("xxyz"));// → true
        split();

        System.out.println("String 02_17");

        //Given two strings, a and b, create a bigger string made of the first char of a,
        //the first char of b, the second char of a, the second char of b, and so on.
        //Any leftover chars go at the end of the result.

        System.out.println(mixString("abc", "xyz"));// → "axbycz"
        System.out.println(mixString("Hi", "There"));// → "HTihere"
        System.out.println(mixString("xxxx", "There"));// → "xTxhxexre"
        split();

        System.out.println("String 03 ***");

        //Given a string, count the number of words ending in ‘y’ or ‘z’ – so the ‘y’
        //in “heavy” and the ‘z’ in “fez” count, but not the ‘y’ in “yellow” (not case sensitive).
        //We’ll say that a y or z is at the end of a word if there is not an alphabetic
        //letter immediately following it.
        //(Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
        System.out.println(countYZ("fez day"));// → 2
        System.out.println(countYZ("day fez"));// → 2
        System.out.println(countYZ("day fyyyz"));// → 2
        split();

        System.out.println("Array 03 ***");
        //Consider the leftmost and righmost appearances of some value in an array.
        // We’ll say that the “span” is the number of elements between the two inclusive.
        // A single value has a span of 1.
        // Returns the largest span found in the given array. (Efficiency is not a priority.)
        int[] arr1 = new int[]{1, 2, 1, 1, 3};
        int[] arr2 = new int[]{1, 4, 2, 1, 4, 1, 4};
        int[] arr3 = new int[]{1, 4, 2, 1, 4, 4, 4};
        System.out.println(maxSpan(arr1));// →4
        System.out.println(maxSpan(arr2));// →6
        System.out.println(maxSpan(arr3));// →6
    }

    private static int maxSpan(int[] array) {
        return 0;
    }

    private static int countYZ(String str) {
        char a = 'z';
        char b = 'y';
        char c = ' ';
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == a && str.charAt(i + 1) == c) || (str.charAt(i) == b && str.charAt(i + 1) == c)) {
                count++;
            }
        }
        if (str.charAt(str.length() - 1) == a || str.charAt(str.length() - 1) == b) {
            count++;
        }

        return count;
    }

    private static String mixString(String a, String b) {
        String result1 = "";
        String result2 = "";
        int length = 0;
        String bigWord = "";
        if (a.length() > b.length()) {
            length = b.length();
            bigWord = a;
        }
        length = a.length();
        bigWord = b;
        for (int i = 0; i < length; i++) {
            result1 = result1 + a.charAt(i) + b.charAt(i);
            result2 = result1 + bigWord.substring(length);
        }
        return result2;
    }

    private static boolean xyzThere(String input) {
        String strf = ".xyz";
        String strt = "xyz";
        if (input.contains(strf)) {
            return false;
        } else if (input.contains(strt)) {
            return true;
        }
        return false;
    }

    private static boolean catDog(String str) {
        String cat = "cat";
        String dog = "dog";
        if (str.contains(cat) && str.contains(dog)) {
            return true;
        }

        return false;
    }

    private static boolean count(String str) {
        String cat = "cat";
        String dog = "dog";
        int index1 = 0;
        int index2 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(dog, index1) == -1) {
                break;
            }
            index1 = str.indexOf(dog, index1) + dog.length();
            count1++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(cat, index2) == -1) {
                break;
            }
            index2 = str.indexOf(cat, index2) + cat.length();
            count2++;
        }
        if (count1 == count2) {
            return true;
        }

        return false;
    }

    private static String nTwice(String str, int number) {
        String result = "";
        //for (int i = 0; i < number; i++) {
        String firstPart = "";
        String secondPart = "";
        firstPart += str.substring(0, number);
        secondPart += str.substring(str.length() - number);
        result = firstPart + secondPart;
        //System.out.println("test"+ firstPart);
        return result;
    }

    private static String withoutEnd2(String str) {
        String result = "";
        //for (int i = 0; i < str.length(); i++) {
        //System.out.println(i);
        result = str.substring(1, str.length() - 1);
        // }
        return result;
    }
}
