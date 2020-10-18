package day28.Homework28;

import static day06.Classwork2.split;

public class String02HW {
    public static void main(String[] args) {
        System.out.println("CatDog " + catDog("catdog")); // → true
        System.out.println("CatDog " + catDog("catcat")); // → false
        System.out.println("CatDog " + catDog("1cat1cadodog")); // → true
        System.out.println("CatDog " + catDog("1cat1catdodog")); // → false
        split();
        System.out.println("Xyz " + xyzThere("abcxyz")); // → true
        System.out.println("Xyz " + xyzThere("abc.xyz")); // → false
        System.out.println("Xyz " + xyzThere("xyz.abc")); // → true
        System.out.println("Xyz " + xyzThere("abc")); // → false
        split();
        System.out.println("MixString " + mixString("abc", "xyz")); // → "axbycz"
        System.out.println("MixString " + mixString("Hi", "There")); // → "HTihere"
        System.out.println("MixString " + mixString("xxxx", "There")); // → "xTxhxexre"
    }

    private static String mixString(String a, String b) {
        String output = "";
        int minLength = Math.min(a.length(), b.length());
        for (int i = 0; i < minLength; i++) {
            output += "" + a.charAt(i) + b.charAt(i);
        }
        return output + a.substring(minLength) + b.substring(minLength);
    }

    private static boolean xyzThere(String str) {
        String magic = "xyz";
        int place = str.indexOf(magic);
        if (place == 0) {
            return true;
        }
        if (place < 0 || str.charAt(place - 1) == '.') {
            return false;
        }
        return true;
    }

    private static boolean catDog(String input) {
        String cat = "cat";
        String dog = "dog";
        int numberCat = 0;
        int numberDog = 0;
        int findIndex = 0;
        int indexWord = input.indexOf(cat, findIndex);
        while (indexWord != -1) {
            numberCat++;
            findIndex = indexWord + cat.length();
            indexWord = input.indexOf(cat, findIndex);
        }
        findIndex = 0;
        indexWord = input.indexOf(dog, findIndex);
        while (indexWord != -1) {
            numberDog++;
            findIndex = indexWord + dog.length();
            indexWord = input.indexOf(dog, findIndex);
        }
        if (numberCat == numberDog) {
            return true;
        }
        return false;
    }
}

