package day27;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(plusOut("12xy34", "xy"));// → "++xy++"
        System.out.println(plusOut("12xy34", "1"));//→ "1+++++"
        System.out.println(plusOut("12xy34xyabcxy", "xy"));// → "++xy++xy+++xy"
    }

    private static String plusOut(String str, String xy) {
        String result = "";
        String plus = "+";
        int count = 0;
        String input = str;
        for (int i = 0; i < str.length(); i++) {
            if (i == input.indexOf(xy) + count) {
                result += str.substring(i, i + xy.length());
                i += xy.length() - 1;
                count += input.indexOf(xy)+xy.length();
                input = input.substring(input.indexOf(xy)+xy.length());
            } else {
                result += plus;
            }
        }
        return result;
    }
}

