package kw6.day26.HomeWork;

import static kw2.day6.ClassWork3.split;

public class HomeWork810 {
    public static void main(String[] args) {
        //Nr. 8 вернуть количество раз "hi" в строке
        System.out.println(countHi("abc hi ho")); //→ 1
        System.out.println(countHi("ABChi hi")); //→ 2
        System.out.println(countHi("hihi")); //→ 2

        split();
        //Nr.9 учитывая две строки, вернуть правду если одна из строк появляется
        //в конце другой строки, игнорируя верхний регистр
        System.out.println(endOther("Hiabc", "abc")); //→true
        System.out.println(endOther("AbC", "HiaBc")); //→true
        System.out.println(endOther("abc", "abXabc")); //→true
        split();
        //Скажем, что строка является xy-балансной, если для всех символов 'x' в строке, где-то позже в строке есть символ 'y'.
        //Так что "xxy" сбалансирован, а "xyx" - нет. Один 'y'
        // может балансировать несколько 'x'. Возвращает true,
        // если заданная строка сбалансирована по xy.
        System.out.println(xyBalance("aaxbby")); // → true
        System.out.println(xyBalance("aaxbb")); // → false
        System.out.println(xyBalance("yaaxbb")); // → false

    }

    private static boolean xyBalance(String str) {
        boolean y = true;
        for (int i = 0; i < str.length(); i++) {
            if (Character.toString(str.charAt(i)).equals("x") && y) {
                y = false;
            } else if (Character.toString(str.charAt(i)).equals("y") && !y) {
                y = true;
            }
        }
        return y;
    }

    private static boolean endOther(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return str1.substring(str1.length() - str2.length()).toLowerCase().equals(str2.toLowerCase());
        } else {
            return str2.substring(str2.length() - str1.length()).toLowerCase().equals(str1.toLowerCase());
        }
    }

    private static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i')
                count++;
        }
        return count;
    }
}