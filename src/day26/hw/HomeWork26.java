package day26.hw;
        /*8. Return the number of times that the string "hi" appears anywhere in the given string.
        countHi("abc hi ho") → 1
        countHi("ABChi hi") → 2
        countHi("hihi") → 2
        9. Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case
        differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase
        version of a string.
        endOther("Hiabc", "abc") → true
        endOther("AbC", "HiaBc") → true
        endOther("abc", "abXabc") → true
        10. We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string.
        So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
        xyBalance("aaxbby") → true
        xyBalance("aaxbb") → false
        xyBalance("yaaxbb") → false*/

import static day06.Classwork2.split;

public class HomeWork26 {
    public static void main(String[] args) {
        split();
        System.out.println(countHi("abc hi ho"));// → 1
        System.out.println(countHi("ABChi hi"));// → 2
        System.out.println(countHi("hihi"));// → 2
        System.out.println(countHi("h i hihallo hi i"));// → 2
        split();
        System.out.println(endOther("Hiabc", "abc"));// → true
        System.out.println(endOther("AbC", "HiaBc"));// → true
        System.out.println(endOther("abc", "abXabc"));// → true
        System.out.println(endOther("abc", "abXabz"));// → false
        split();
        System.out.println(xyBalance("aaxbby"));// → true
        System.out.println(xyBalance("aaxbb"));// → false
        System.out.println(xyBalance("yaaxbb"));// → false
        System.out.println(xyBalance("yaaxxbby"));// → true
        split();
    }

    private static boolean xyBalance(String input) {
        int posX = input.indexOf('x');
        for (int i = posX; i < input.length(); i++) {
            if (input.charAt(i) == 'y') {
                return true;
            }
        }
        return false;
    }


    private static boolean endOther(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        return (str1.endsWith(str2) || str2.endsWith(str1));
    }

    private static int countHi(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'h' && input.charAt(i + 1) == 'i') {
                count++;
            }
        }

        return count;
    }
}
