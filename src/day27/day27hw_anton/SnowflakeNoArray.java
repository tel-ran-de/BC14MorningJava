package day27.day27hw_anton;

public class SnowflakeNoArray {
    public static void main(String[] args) {
        snowflake(10);
    }

    private static void snowflake(int line) {
        for (int i = 0; i <= 10; i++) {
            String result = "";
            for (int j = 0; j <= line; j++) {
                if ((j == i || j + i == line) && j != line / 2) {
                    result += " *";
                } else if (j == line / 2) {
                    result += " *";
                } else {
                    result += "  ";
                }
            }
            if (i == line / 2) {
                result = result.trim();
                for (int j = 0; j < line; j++) {
                    result += " *";
                }
            }
            System.out.printf("%22s\n",result);
        }
    }
}
