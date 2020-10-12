package day25;

import static day06.Classwork2.split;

public class HomeWork23 {
    public static void main(String[] args) {
        System.out.println(repeatSeparator("Word", "X", 3));//→ "WordXWordXWord"
        System.out.println(repeatSeparator("This", "And", 2));// → "ThisAndThis"
        System.out.println(repeatSeparator("This", "And", 1));// → "This"
        split();
        System.out.println(getSandwich("breadjambread"));// → "jam"
        System.out.println(getSandwich("xxbreadjambreadyy"));// → "jam"
        System.out.println(getSandwich("xxbreadyy"));// → ""
    }

    private static String getSandwich(String str) {
        String output = "";
        int first = 0;
        String bread = "bread";
        first = str.indexOf(bread);
        int last = str.lastIndexOf(bread);
        if (first != last) {
            output = str.substring(first + bread.length(), last);
        }
        return output;
    }

    private static String repeatSeparator(String mainWord, String sep, int number) {
        String output = "";
        for (int i = 0; i < number - 1; i++) {
            output += mainWord + sep;

        }
        output += mainWord;
        return output;
    }
}
