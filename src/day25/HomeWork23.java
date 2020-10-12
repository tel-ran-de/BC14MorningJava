package day25;

/*1. Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the
        separator string.
        repeatSeparator("Word", "X", 3) → "WordXWordXWord"
        repeatSeparator("This", "And", 2) → "ThisAndThis"
        repeatSeparator("This", "And", 1) → "This"
        2. A sandwich is two pieces of bread with something in between.
        Return the string that is between the first and last appearance of "bread" in the given string,
        or return the empty string "" if there are not two pieces of bread.
        3. Look for patterns like "zip" and "zap" in the string -- length-3,
        starting with 'z' and ending with 'p'. Return a string where for all such words,
        the middle letter is gone, so "zipXzap" yields "zpXzp". */
public class HomeWork23 {
    public static void main(String[] args) {
       /* System.out.println(repeatSeparator("Word", "X", 3));// → "WordXWordXWord"
        System.out.println(repeatSeparator("This", "And", 2));// → "ThisAndThis"
        System.out.println(repeatSeparator("This", "And", 1));// → "This"*/
       /* System.out.println(getSandwich("breadjambread"));// → "jam"
        System.out.println(getSandwich("xxbreadjambreadyy"));// → "jam"
        System.out.println(getSandwich("xxbreadyy"));// → ""*/
        System.out.println(zipZap("zipXzap"));// → "zpXzp"
        System.out.println(zipZap("zopzop"));// → "zpzp"
        System.out.println(zipZap("zzzopzop"));// → "zzzpzp"
    }

    private static String zipZap(String str) {
        String output = str;
        for (int i = 1; i < output.length() - 1; i++) {
            if (output.charAt(i - 1) == 'z' && output.charAt(i + 1) == 'p') {
                output = output.substring(0, i) + output.substring(i + 1);
            }
        }

        return output;
    }

    /*private static String zipZapRegEx(String str) {
        String output = "";
        output = str.replaceAll("z.p", "zp");
        return output;
    }*/

    private static String getSandwich(String str) {
        String output = "";
        int indexStart = 0;
        String bread = "bread";
        indexStart = str.indexOf(bread);
        int indexEnd = str.lastIndexOf(bread);
        if (indexEnd != indexStart) {
            output = str.substring(indexStart + bread.length(), indexEnd);
        }
        return output;
    }

    private static String repeatSeparator(String str1, String str2, int key) {
        String output = "";
        for (int i = 0; i < key - 1; i++) {
            output += str1 + str2;
        }
        output += str1;
        return output;
    }
}
