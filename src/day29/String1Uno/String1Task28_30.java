package day29.String1Uno;

public class String1Task28_30 {
    public static void main(String[] args) {

        System.out.println(twoChar("java", 0)); //→ "ja"
        System.out.println(twoChar("java", 2)); //→ "va"
        System.out.println(twoChar("java", 3)); //→ "ja"

        System.out.println();

        System.out.println(atFirst("hello")); //→ "he"
        System.out.println(atFirst("hi")); //→ "hi"
        System.out.println(atFirst("h")); //→ "h@"

        System.out.println();

        System.out.println(lastTwo("coding")); //→ "codign"
        System.out.println(lastTwo("cat")); //→ "cta"
        System.out.println(lastTwo("ab")); //→ "ba"
    }

    private static String lastTwo(String input) {
        String output = "";
        if (input.length() < 2) {
            output = input;
        } else {
            output = output + input.substring(0, input.length() - 2) + input.charAt(input.length() - 1
                    + input.length() - 2);
        }
        return output;
    }

    private static String atFirst(String str) {
        String output = "";
        if (str.length() >= 2) {
            output = output + str.substring(0, 2);
        } else {
            output = output + str + "@";
        }
        return output;
    }

    private static String twoChar(String str, int start) {
        String output = "";
        if (start <= 2) {
            output = output + str.substring(start, start + 2);
        } else {
            output = output + str.substring(0, 2);
        }
        return output;
    }
}

