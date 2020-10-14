package day27.hw_Nadja;

public class MakeSnowflake {
    public static void main(String[] args) {
        String Snowflake = "*     *     *";
        // String Snowflake = " *   *   * ";
        printStringSnowflake(Snowflake);
    }

    private static void printStringSnowflake(String str) {
        System.out.println(str);
        String space = " ";
        String star = "*";
        String outputSnowflake = str;
        int index = (str.length() - 1) / 2;
        String outputSnowflakeEnd = str.substring(index + 1, str.length());

        for (int i = 0; i < index - 1; i++) {
            outputSnowflake = space + outputSnowflake.substring(0, index - 1)
                    + str.charAt(index)
                    + outputSnowflakeEnd.substring(i + 1, index);
            System.out.println(outputSnowflake);
        }
        //mid
        for (int i = 0; i < str.length(); i++) {
            System.out.print(star);
        }
        System.out.println();
        //bottom

        int indexBottom = (str.length() - 1) / 2;
        String endSnowFlake = str.substring(0, index);
        String outputSnowflakeEndBottom = str.substring(indexBottom + 1, str.length());
        String outputSnowflakeBottom = space + outputSnowflakeEndBottom.substring(1, index)
                + str.charAt(index) + endSnowFlake;
        System.out.println(outputSnowflakeBottom);

        for (int i = 1; i < index; i++) {
            outputSnowflakeBottom = outputSnowflakeEndBottom.substring(i, index) + outputSnowflakeEnd.substring(0, i);
            outputSnowflakeBottom += str.charAt(index);
            outputSnowflakeBottom += outputSnowflakeEnd.substring(0, i) + endSnowFlake.charAt(0);
            System.out.println(outputSnowflakeBottom);

        }
    }
}
