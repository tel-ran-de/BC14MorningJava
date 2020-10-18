package day29.String1Uno;

public class String1Task6 {
    public static void main(String[] args) {
        /*Given a string, return true if it ends in "ly". */

        System.out.println(endsLy("oddly")); //→ true
        System.out.println(endsLy("y")); //→ false
        System.out.println(endsLy("oddy")); //→ false
    }

    private static boolean endsLy(String str) {
        return (str.endsWith("ly"));
    }
}
