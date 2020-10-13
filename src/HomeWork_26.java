import static day06.Classwork2.split;

public class HomeWork_26 {
    public static void main(String[] args) {
        System.out.println(countHi("abc hi ho"));// →1
        System.out.println(countHi("ABChi hi"));// →2
        System.out.println(countHi("hihi"));// →2
        split();
        System.out.println(endOther("Hiabc", "abc"));// →true
        System.out.println(endOther("AbC", "HiaBc"));// →true
        System.out.println(endOther("abc", "abXabc"));// →true
        split();
        System.out.println(xyBalance("aaxbby"));// →true
        System.out.println(xyBalance("aaxbb"));// →false
        System.out.println(xyBalance("yaaxbb"));// →false
        System.out.println(xyBalance("x"));// →false
    }

    private static boolean xyBalance(String str) {
        int myX = str.lastIndexOf('x');
        int myY = str.lastIndexOf('y');
        if (str.length() < 2) {
            return false;
        } else if (myX < myY) {
            return true;
        }
        return false;
    }

    private static boolean endOther(String word, String end) {
        String newWord = word.toLowerCase();
        String newEnd = end.toLowerCase();
        for (int i = 0; i < newWord.length(); i++) {
            if (newWord.charAt(newWord.length() - 1) == newEnd.charAt(newEnd.length() - 1)
                    && newWord.charAt(newWord.length() - 2) == newEnd.charAt(newEnd.length() - 2) &&
                    newWord.charAt(newWord.length() - 3) == newEnd.charAt(newEnd.length() - 3)) {
                return true;
            }

        }
        return false;
    }

    private static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                count++;
            }
        }
        return count;
    }
}
