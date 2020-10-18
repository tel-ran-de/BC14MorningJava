package day26.day26hw;

public class HomeWork26Anton {
    public static void main(String[] args) {
        System.out.println(countHi("abc hi ho"));// → 1
        System.out.println(countHi("ABChi hi"));// → 2
        System.out.println(countHi("hihi"));// → 2

        System.out.println(endOther("Hiabc", "abc"));// → true
        System.out.println(endOther("AbC", "HiaBc"));// → true
        System.out.println(endOther("abc", "abXabc"));// → true

        System.out.println(xyBalance("aaxbby"));// → true
        System.out.println(xyBalance("aaxbb"));// → false
        System.out.println(xyBalance("yaaxbb"));// → false

    }

    private static boolean xyBalance(String str) {
        return str.substring(str.lastIndexOf('x')).contains("y");
    }

    private static boolean endOther(String str1, String str2) {
        return str1.length() < str2.length() ? str2.toLowerCase().endsWith(str1.toLowerCase()) :
                str1.toLowerCase().endsWith(str2.toLowerCase());
    }

    private static int countHi(String str) {
        int count = 0;
        String input = str;
        for (int i = 0; i < input.length(); i++) {
            if (input.contains("hi")) {
                count++;
                input = input.substring(input.indexOf("hi") + 2);
            }
        }
        return count;
    }


}
