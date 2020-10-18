package day29.HW28;

public class String2Task16 {
    public static void main(String[] args) {
        /*Return true if the given string contains an appearance of “xyz”
        where the xyz is not directly preceeded by a period (.). So “xxyz” counts but “x.xyz” does not.*/
        System.out.println(xyzThereOne("abcxyz")); //→ true
        System.out.println(xyzThereOne("abc.xyz")); //→ false
        //System.out.println(xyzThereOne("xyz.abc")); //→ true

        System.out.println();

        System.out.println(xyzThereTwo("abcxyz")); //→ true
        System.out.println(xyzThereTwo("abc.xyz")); //→ false
        System.out.println(xyzThereTwo("xyz.abc")); //→ true

        System.out.println();

        System.out.println(xyzThereThree("abcxyz")); //→true
        System.out.println(xyzThereThree("abc.xyz")); //→false
        System.out.println(xyzThereThree("xyz.abc")); //→true
    }

    private static boolean xyzThereThree(String sentance) {
        for (int i = 0; i < sentance.length() - 2; i++) {
            if ("xyz".equals(sentance.substring(i, i + 3)) && sentance.charAt(i-1) == '.') {
                return false;
            }
        }
        return true;
    }

    private static boolean xyzThereTwo(String input) {
        if (input.contains(".xyz")) {
            return false;
        }
        return true;
    }

    private static boolean xyzThereOne(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x' && str.charAt(i - 1) == '.') {
                return false;
            }
        }
        return true;
    }
}
