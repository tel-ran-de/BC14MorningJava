package day28.hw;

public class HomeworkStrink03 {
    public static void main(String[] args) {
        System.out.println(countYZ("fez day"));// →2
        System.out.println(countYZ("day fez"));// →2
        System.out.println(countYZ("day fyyyz"));// →2
    }

    private static int countYZ(String s1) {
        char y = 'y';
        char z = 'z';
        char no = ' ';
        int count = 0;
        for (int i = 0; i < s1.length() - 1; i++) {
            if (s1.charAt(i) == y && s1.charAt(i + 1) == no || s1.charAt(i) == z && s1.charAt(i + 1) == no) {
                count++;
            }

        }
        if (s1.charAt(s1.length() - 1) == y || s1.charAt(s1.length() - 1) == z) {
            count++;
        }
        return count;
    }
}
