package day33.hw33anton;

import java.util.Date;
import java.util.Timer;

public class TowerOfHanoiAnton {
    public static void main(String[] args) {
        String[][] tower = new String[4][3];
        fillTowerStart(tower);
        printHanoi(tower);
        sortHanoi(tower);
printHanoi(tower);

    }

    private static int isTop(String[][] arr, int y) {
        int row = 0;
        while (arr[row][y].isEmpty() && row < arr.length - 1) {
            row++;
        }
        return row;
    }

    private static void sortHanoi(String[][] arr) {
        final int A = 0;
        final int B = 1;
        final int C = 2;

        int count = 0;
        if ((!arr[isTop(arr, A)][A].isEmpty() && arr[isTop(arr, A)][A].length() < arr[isTop(arr, B)][B].length() &&
                arr[isTop(arr, A)][A].length() % 2 != arr[isTop(arr, B)][B].length() % 2) ||
                arr[isTop(arr, B)][B].isEmpty()) {
            int x = arr[isTop(arr, B)][B].isEmpty() ? isTop(arr, B) : isTop(arr, B) - 1;
            arr[x][B] = arr[isTop(arr, A)][A];
            arr[isTop(arr, A)][A] = "";
            count++;
        } else if ((!arr[isTop(arr, B)][B].isEmpty() && arr[isTop(arr, B)][B].length() < arr[isTop(arr, C)][C].length() &&
                arr[isTop(arr, B)][B].length() % 2 != arr[isTop(arr, C)][C].length() % 2)
        ) {
            int x = arr[isTop(arr, C)][C].isEmpty() ? isTop(arr, C) : isTop(arr, C) - 1;
            arr[x][C] = arr[isTop(arr, B)][B];
            arr[isTop(arr, B)][B] = "";
            count++;
        } else if ((!arr[isTop(arr, A)][A].isEmpty() && arr[isTop(arr, A)][A].length() < arr[isTop(arr, C)][C].length() &&
                arr[isTop(arr, A)][A].length() % 2 != arr[isTop(arr, C)][C].length() % 2) ||
                arr[isTop(arr, C)][C].isEmpty()) {
            int x = arr[isTop(arr, C)][C].isEmpty() ? isTop(arr, C) : isTop(arr, C) - 1;
            arr[x][C] = arr[isTop(arr, A)][A];
            arr[isTop(arr, A)][A] = "";
            count++;
        } else if (!arr[isTop(arr, C)][C].isEmpty() &&
                arr[isTop(arr, C)][C].length() < arr[isTop(arr, A)][A].length() &&
                arr[isTop(arr, A)][A].length() % 2 != arr[isTop(arr, C)][C].length() % 2
        ) {
            int x = arr[isTop(arr, A)][A].isEmpty() ? isTop(arr, A) : isTop(arr, A) - 1;
            arr[x][A] = arr[isTop(arr, C)][C];
            arr[isTop(arr, C)][C] = "";
            int y = arr[isTop(arr, B)][B].isEmpty() ? isTop(arr, B) : isTop(arr, B) - 1;
            arr[y][B] = arr[isTop(arr, C)][C];
            arr[isTop(arr, C)][C] = "";
            count++;
        } else if (arr[isTop(arr, A)][A].isEmpty()) {
            arr[isTop(arr, A)][A] = arr[isTop(arr, B)][B];
            arr[isTop(arr, B)][B] = "";

            arr[isTop(arr, A) - 1][A] = arr[isTop(arr, C)][C];
            arr[isTop(arr, C)][C] = "";
            count++;
        }
        if (arr[0][C].isEmpty() && count != 0) {
            long startTime = System.currentTimeMillis();
            long elapsedTime = 0L;

            while (elapsedTime < 3 * 1000) {
                elapsedTime = (new Date()).getTime() - startTime;
            }
            printHanoi(arr);
            sortHanoi(arr);
        }
    }

    private static void printHanoi(String[][] input) {
        for (String[] row : input) {
            for (String element : row) {
                System.out.printf("%-5s", element);
            }
            System.out.println();
        }
    }

    private static void fillTowerStart(String[][] tower) {
        String star = "*";
        for (int i = 0; i < tower.length; i++) {
            for (int j = 0; j < tower[i].length; j++) {
                tower[i][j] = "";
            }
        }
        for (int i = 0; i < tower.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                tower[i][0] += star;
            }
        }
    }
}
