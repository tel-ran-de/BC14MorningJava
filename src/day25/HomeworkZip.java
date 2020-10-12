package day25;

public class HomeworkZip {
    public static void main(String[] args) {
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

    private static String zipZapRegX(String word) {
        String output = "";
        output = word.replaceAll("z.p", "zp");//точка - все между символами
        return output;
    }
}
