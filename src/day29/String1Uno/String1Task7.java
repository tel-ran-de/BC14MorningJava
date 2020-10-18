package day29.String1Uno;

public class String1Task7 {
    public static void main(String[] args) {
        /* Given a string of odd length, return the string length 3
        from its middle, so "Candy" yields "and".
        The string length will be at least 3.   */

        System.out.println(middleThree("Candy")); //→ "and"
        System.out.println(middleThree("and")); //→ "and"
        System.out.println(middleThree("solving")); //→ "lvi"

    }

    private static String middleThree(String str) {
        String output = "";
        int symbolLocation = str.length() / 2;
        output = str.substring(symbolLocation - 1, symbolLocation + 2);
        return output;
        //return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
    }
}
