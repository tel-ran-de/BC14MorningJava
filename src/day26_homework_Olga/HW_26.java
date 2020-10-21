package day26_homework_Olga;

public class HW_26 {
    public static void main(String[] args) {
        System.out.println(countHi("abc hi ho"));// → 1
        System.out.println(countHi("ABChi hi"));// → 2
        System.out.println(countHi("hihi"));// → 2
    }
    private static int countHi(String input) {
        int count = 0;
        char a1 = 'h';
        char a2 = 'i';
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == a1 && input.charAt(i + 1) == a2) {
                count++;
            }
        }
        return count;
    }
}
