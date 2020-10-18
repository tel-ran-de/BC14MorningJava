package day25;

public class HomeWork23 {
    public static void main(String[] args) {
      /*  System.out.println(repeatSeparator("Word", "X", 3));
        System.out.println(repeatSeparator("This", "And", 2));
        System.out.println(repeatSeparator("This", "And", 1));
*/
        System.out.println(getSandwich("breadjambread"));// → "jam"
        System.out.println(getSandwich("xxbreadjambreadyy"));// → "jam"
        System.out.println(getSandwich("xxbreadyy"));//     ""
    }

    private static String getSandwich(String str) {
        String output = "";
        int indexStart = 0;
        String bread = "bread";
        indexStart = str.indexOf(bread);
        // System.out.println("indexStart= "+str.indexOf(bread));
        int indexEnd = str.lastIndexOf(bread);
        //System.out.println("indexend= "+indexEnd);

        if (indexEnd != indexStart) {
            output = str.substring(indexStart + bread.length(), indexEnd);
        }
        return output;
    }

    private static String repeatSeparator(String str1, String str2, int numer) {
        String outputStr = "";
        for (int i = 0; i < numer - 1; i++) {
            outputStr += str1 + str2;
        }
        outputStr += str1;
        return outputStr;
    }
}
