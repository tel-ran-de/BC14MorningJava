package HW28;

public class String02_17 {
    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz")); //→ "axbycz"
        System.out.println(mixString("Hi", "There")); //→ "HTihere"
        System.out.println(mixString("xxxx", "There")); //→ "xTxhxexre"
    }

    private static String mixString(String str1, String str2) {
        String newString = "";
        int strMin = Math.min(str1.length(), str2.length());
        for (int i = 0; i < strMin; i++) {
            newString += "" + str1.charAt(i) + str2.charAt(i);
        }
        return newString + str1.substring(strMin) + str2.substring(strMin);
    }
}
