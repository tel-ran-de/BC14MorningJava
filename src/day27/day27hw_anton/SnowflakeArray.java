package day27.day27hw_anton;

public class SnowflakeArray {
    public static void main(String[] args) {
        printTwoDCharArray(snowflake(10));
    }

    private static void printTwoDCharArray(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            String result = "";
            for (char element : arr[i]) {
                result += element + " ";
            }
            System.out.printf("%22s\n", result);
        }
    }

    private static char[][] snowflake(int line) {
        char[][] result = new char[line + 1][line + 1];
        char star = '*';
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (j == i || j == line - i || i == line / 2 || j == line / 2) {
                    result[i][j] = star;
                } else {
                    result[i][j] = ' ';
                }
            }
        }
        return result;
    }
}
