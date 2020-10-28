package day33.hw33nadja;

public class MineSwiperInt1 {

        public static void main(String[] args) {
            // 1. Создать поле (двумерный массив)
            // 2. Вывести на экран
            // 3. Указать кол-во бомб
            // 4. Установить бомбы
            // 5. Расписать поле по установке: 0-0, 1-1, 2-2 ... 8-8
            // 5.а проверяем каждую клетку по горизонтали, в обе стороны [i, j+1] и [i, j-1]
            // 5.b проверка по вертикали [i-1, j], [i+1, j]
            // 5.c проверяем верхний левый угол [i-1, j-1]
            // 5.d проверяем верхний правый угол [i-1, j+1]
            // 5.e проверяем нижний левый угол [i+1, j-1]
            // 5.f проверяем нижний правый угол [i+1, j+1]
            // 6. проверка начала и конца массива
            // 7. проверка ниличия бомб в клетках проверки
            int[][] field = createField(10);
            //System.out.println(Arrays.toString(field));
            printArray(field);
            setNumber(field);
            printArray(field);

        }

        private static void setNumber(int[][] field) {
            int bomb = -1;
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    if (field[i][j] == bomb) {
                        if (i == 0 && j != 0 && j != field[i].length - 1) {
                            searchHorizontalyLeft(field, i, j);
                            searchHorizontalyRight(field, i, j);
                            searchLowerLeft(field, i, j);
                            searchLowerRight(field, i, j);
                            searchVerticallyLower(field, i, j);
                            continue;
                        }
                        if (i == 0 && j == 0) {
                            searchVerticallyLower(field, i, j);
                            searchLowerRight(field, i, j);
                            searchHorizontalyRight(field, i, j);
                            continue;
                        }
                        if (j == 0 && i != 0 && i != field.length - 1) {
                            searchVerticallyUp(field, i, j);
                            searchVerticallyLower(field, i, j);
                            searchUpperRight(field, i, j);
                            searchHorizontalyRight(field, i, j);
                            searchLowerRight(field, i, j);
                            continue;
                        }
                        if (i == field.length - 1 && j != 0 && j < field.length - 1) {
                            searchUpperLeft(field, i, j);
                            searchVerticallyUp(field, i, j);
                            searchUpperRight(field, i, j);
                            searchHorizontalyLeft(field, i, j);
                            searchHorizontalyRight(field, i, j);
                            continue;
                        }
                        if (i == field.length - 1 && j == 0) {
                            searchVerticallyUp(field, i, j);
                            searchUpperRight(field, i, j);
                            searchHorizontalyRight(field, i, j);
                            continue;
                        }
                        if (i == field.length - 1 && j == field[i].length - 1) {
                            searchUpperLeft(field, i, j);
                            searchHorizontalyLeft(field, i, j);
                            searchVerticallyUp(field, i, j);
                            continue;
                        }
                        if (i == 0 && j == field[i].length - 1) {
                            searchHorizontalyLeft(field, i, j);
                            searchLowerLeft(field, i, j);
                            searchVerticallyLower(field, i, j);
                            continue;
                        }
                        if (j == field[i].length - 1 && i != 0 && i != field.length - 1) {
                            searchUpperLeft(field, i, j);
                            searchHorizontalyLeft(field, i, j);
                            searchLowerLeft(field, i, j);
                            searchVerticallyUp(field, i, j);
                            searchVerticallyLower(field, i, j);
                            continue;
                        } else {
                            searchHorizontalyLeft(field, i, j);
                            searchHorizontalyRight(field, i, j);
                            searchVerticallyUp(field, i, j);
                            searchVerticallyLower(field, i, j);
                            searchUpperLeft(field, i, j);
                            searchUpperRight(field, i, j);
                            searchLowerLeft(field, i, j);
                            searchLowerRight(field, i, j);
                        }
                    }
                }
            }
        }

        private static void searchHorizontalyLeft(int[][] arr, int x, int y) {

            if (arr[x][y - 1] != -1) {
                arr[x][y - 1] = arr[x][y - 1] + 1;
            }
        }

        private static void searchHorizontalyRight(int[][] arr, int x, int y) {
            if (arr[x][y + 1] != -1) {
                arr[x][y + 1] = arr[x][y + 1] + 1;
            }
        }

        private static void searchVerticallyUp(int[][] arr, int x, int y) {
            if (arr[x - 1][y] != -1) {
                arr[x - 1][y] = arr[x - 1][y] + 1;
            }
        }

        private static void searchVerticallyLower(int[][] arr, int x, int y) {
            if (arr[x + 1][y] != -1) {
                arr[x + 1][y] = arr[x + 1][y] + 1;
            }
        }

        private static void searchUpperLeft(int[][] arr, int x, int y) {
            if (arr[x - 1][y - 1] != -1) {
                arr[x - 1][y - 1] = arr[x - 1][y - 1] + 1;
            }
        }

        private static void searchUpperRight(int[][] arr, int x, int y) {
            if (arr[x - 1][y + 1] != -1) {
                arr[x - 1][y + 1] = arr[x - 1][y + 1] + 1;
            }
        }

        private static void searchLowerLeft(int[][] arr, int x, int y) {
            if (arr[x + 1][y - 1] != -1) {
                arr[x + 1][y - 1] = arr[x + 1][y - 1] + 1;
            }
        }

        private static void searchLowerRight(int[][] arr, int x, int y) {
            if (arr[x + 1][y + 1] != -1) {
                arr[x + 1][y + 1] = arr[x + 1][y + 1] + 1;
            }
        }

        private static void printArray(int[][] field) {
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    System.out.print(field[i][j] + " ");
                }
                System.out.println();
            }
        }

        private static int[][] createField(int size) {
            int[][] output = new int[size][size];
            int bomb = -1;
            int bombPercent = 10;
            int bombCount = (size * size * bombPercent) / 100;
            for (int i = 0; i < bombCount; i++) {
                int x = (int) (Math.random() * size);
                int y = (int) (Math.random() * size);
                if (output[x][y] != bomb) {
                    output[x][y] = bomb;
                } else {
                    i--;
                }
            }
            return output;
        }
    }
