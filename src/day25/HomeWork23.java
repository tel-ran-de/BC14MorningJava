package day25;

public class HomeWork23 {
    public static void main(String[] args) {

       /* System.out.println(repeatSeparator("Word", "X", 3));// → "WordXWordXWord"
        System.out.println(repeatSeparator("This", "And", 2));// → "ThisAndThis"
        System.out.println(repeatSeparator("This", "And", 1));// → "This"
        */
        System.out.println(getSandwich("breadjambread"));// → "jam"
        System.out.println(getSandwich("xxbreadjambreadyy"));// → "jam"
        System.out.println(getSandwich("xxbreadyy"));// → ""
    }

    private static String getSandwich(String str) {
        String output = "";
        String bread = "bread";
        int indexStart = str.indexOf(bread);
        int indexEnd = str.lastIndexOf(bread);
        if (indexEnd != indexStart) {
            output = str.substring(indexStart + bread.length(), indexEnd);
        }

        return output;
    }

    private static String repeatSeparator(String str, String seperator, int repeat) {
        String output = str;
        for (int i = 1; i < repeat; i++) {
            output += seperator + str;
        }
        return output;
    }
}
