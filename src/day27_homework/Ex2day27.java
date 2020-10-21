package day27_homework;

public class Ex2day27 {
    public static void main(String[] args) {
        System.out.println(plusOut("12xy34", "xy")); // → "++xy++"
        System.out.println(plusOut("12xy34", "1")); // → "1+++++"
        System.out.println(plusOut("12xy34xyabcxy", "xy")); // → "++xy++xy+++xy"
    }

    private static String plusOut(String str1, String str2) {
        String result = "";
        String plus = "+";
        int start = str1.indexOf(str2);
        while (start != -1) {
            for (int i = 0; i < start; i++) {
                result += plus;
            }
            result += str2;
            str1 = str1.substring(start + str2.length());
            start = str1.indexOf(str2);
        }
        for (int i = 0; i < str1.length(); i++) {
            result+=plus;
        }
        return result;
    }
}
