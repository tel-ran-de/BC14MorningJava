package day25;

public class Homework23 {
    public static void main(String[] args) {
        //System.out.println(repeatSeparator("Word", "X", 3));// → "WordXWordXWord"
        //System.out.println(repeatSeparator("This", "And", 2));// → "ThisAndThis"
        //System.out.println(repeatSeparator("This", "And", 1));// → "This"

        //System.out.println(getSandwich("breadjambread")); //→ "jam"
        //System.out.println(getSandwich("xxbreadjambreadyy"));// → "jam"
        //System.out.println(getSandwich("xxbreadyy"));// → ""

        System.out.println(zipZap("zipXzap"));// → "zpXzp"
        System.out.println(zipZap("zopzop"));// → "zpzp"
        System.out.println(zipZap("zzzopzop"));//; → "zzzpzp"

    }

    private static String  zipZap(String str) {

        String output = "";
        output = str.replaceAll("z.p", "zp");


        return output;
    }

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

    private static String repeatSeparator(String str1, String str2, int number) {
        String result = "";
        for (int j = 0; j < number - 1; j++) {
            result += str1 + str2;

        }
        result += str1;


        return result;
    }
}
