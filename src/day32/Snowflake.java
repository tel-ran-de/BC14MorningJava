package day32;

/**
 * BC14MorningJava
 * 21 10 : 52
 */
public class Snowflake {
    public static void main(String[] args) {
        makeSnowflake(10);
    }

    private static void makeSnowflake(int number) {
        if (number % 2 == 0) {
            number = number + 1;
        }
        String line = "";
        String x = " X ";
        for (int i = 0; i < number; i++) {
            // 1. линия номер один
            // 2. линия номер два
            // 3. линия номер три
            // 4. линия номер четыре
            for (int j = 0; j < number; j++) {
                if (i == number / 2 || j == number / 2 || i == j || i == number - j - 1) {
                    System.out.print(x);
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
}
