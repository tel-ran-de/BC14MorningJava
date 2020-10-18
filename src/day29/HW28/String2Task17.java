package day29.HW28;

public class String2Task17 {
    public static void main(String[] args) {
/* Given two strings, a and b, create a bigger string made
of the first char of a, the first char of b, the second char of a,
the second char of b, and so on. Any leftover chars go at the end of the result. */

        //System.out.println(mixString("abc", "xyz")); //→ "axbycz"
        //System.out.println(mixString("Hi", "There")); //→ "HTihere"
        //System.out.println(mixString("xxxx", "There")); //→ "xTxhxexre"

        System.out.println();

        System.out.println(mixString("abc", "xyz")); //→"axbycz"
        System.out.println(mixString("Hi", "There")); //→"HTihere"
        System.out.println(mixString("xxxx", "There")); //→"xTxhxexre"
    }

    private static String mixString(String word1, String word2) {
        String output = "";
        int word1Length = word1.length();
        int word2Length = word2.length();
        int maxLength = Math.max(word1Length, word2Length);
        for (int i = 0; i < maxLength; i++) {
            if (i < maxLength) {
                output = output + word1.substring(i, i+1) + word2.substring(i, i+1);

        }
    }

    /*private static String mixString(String a, String b) {
        String output = "";
        for (int i = 0; i < b.length(); i++) {
            output = output + a.charAt(i) + b.charAt(i);
        }
        return output; */
        return output;
    }

}

