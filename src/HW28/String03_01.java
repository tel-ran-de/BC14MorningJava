package HW28;

public class String03_01 {
    public static void main(String[] args) {
        System.out.println(countYZ("fez day")); //→ 2
        System.out.println(countYZ("day fez")); //→ 2
        System.out.println(countYZ("day fyyyz"));// → 2
    }

    private static int countYZ(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (
                    (str.length() - 1 == i || !Character.isAlphabetic(str.charAt(i + 1)))
                    && (str.charAt(i) == 'z' || str.charAt(i) == 'y')
            ) {
                count++;
            }
        }
        return count;
    }
}
