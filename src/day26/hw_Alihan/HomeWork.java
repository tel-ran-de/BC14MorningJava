package day26.hw_Alihan;

public class HomeWork {
    public static void main(String[] args) {
        //System.out.println(countHi("abc hi ho"));// → 1
        //System.out.println(countHi("ABChi hi"));// → 2
        //System.out.println(countHi("hihi"));// → 2

        //System.out.println(endOther("Hiabc", "abc"));// → true
        //System.out.println(endOther("AbC", "HiaBc"));// → true
        //System.out.println(endOther("abc", "abXabc"));// → true

        System.out.println(xyBalance("aaxbby"));// → true
        System.out.println(xyBalance("aaxbb"));// → false
        System.out.println(xyBalance("yaaxbb"));// → false
    }

    private static boolean xyBalance(String input) {
        int a = input.indexOf('x');
        int b = input.indexOf('y');
        for (int i = 0; i < input.length() ; i++) {
            return a < b;

        } return false;

    }

    private static boolean endOther(String str1, String str2) {
        if (str1.toLowerCase().endsWith(str2.toLowerCase()) || str2.toLowerCase().endsWith(str1.toLowerCase())){
            return true;
        }
        return false;
    }

    private static int countHi(String input) {
        int count = 0;
        for (int i = 0; i <input.length() ; i++) {
            if (input.charAt(i) == 'h' && input.charAt(i + 1) == 'i'){
                count ++;
            }

        }
        return count;
    }
}
