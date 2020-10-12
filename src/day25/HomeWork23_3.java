package day25;

public class HomeWork23_3 {
    public static void main(String[] args) {
        System.out.println(zipZap("zipXzap"));// → "zpXzp"
        System.out.println(zipZap("zopzop"));// → "zpzp"
        System.out.println(zipZap("zzzopzop"));// → "zzzpzp"
    }

    private static String zipZap(String str) {
        String output = "";
        output = str.replaceAll("z.p", "zp");
        return output;
    }
}
