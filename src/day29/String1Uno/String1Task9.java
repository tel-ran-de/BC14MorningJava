package day29.String1Uno;

public class String1Task9 {
    public static void main(String[] args) {
        /* Given a string, if the string begins with "red" or "blue"
        return that color string, otherwise return the empty string. */

        System.out.println(seeColor("redxx")); //→ "red"
        System.out.println(seeColor("xxred")); //→ ""
        System.out.println(seeColor("blueTimes")); //→ "blue"

        /* Given a string, return a new string made of 3 copies
        of the first 2 chars of the original string. The string may be
         any length. If there are fewer than 2 chars, use whatever is there.   */

        System.out.println(extraFront("Hello")); //→"HeHeHe"
        System.out.println(extraFront("ab")); //→"ababab"
        System.out.println(extraFront("H")); //→"HHH"
    }

    private static String extraFront(String input) {
        if (input.length() < 2) {
            return input + input + input;
        } else {
            String newString = input.substring(0, 2);
            return newString + newString + newString;
        }
    }

    private static String seeColor(String str) {
        String output = "";
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        } else {
            return output;
        }
    }
}
