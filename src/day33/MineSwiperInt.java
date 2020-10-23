package day33;

public class MineSwiperInt {
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
        searchBomb(field);
        printArray(field);

    }

    private static void searchBomb(int[][] field) {
        int bomb = -1;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == bomb) {
                    setNumber(field, i, j);
                }
            }

        }
    }

    private static void setNumber(int[][] arr, int x, int y) {
        int bomb = -1;
        if (y - 1 >= 0) {
            if (arr[x][y - 1] != bomb) {
                arr[x][y - 1]++;
            }
        }
        if (y + 1 < arr.length) {
            if (arr[x][y + 1] != bomb) {
                arr[x][y + 1]++;
            }
        }
        if (x - 1 >= 0) {
            if (arr[x - 1][y] != bomb) {
                arr[x - 1][y]++;
            }
            if (y - 1 >= 0) {
                if (arr[x - 1][y - 1] != bomb) {
                    arr[x - 1][y - 1]++;
                }
            }
            if (y + 1 < arr.length) {
                if (arr[x - 1][y + 1] != bomb) {
                    arr[x - 1][y + 1]++;
                }
            }
        }
        if (x + 1 < arr.length) {
            if (arr[x + 1][y] != bomb) {
                arr[x + 1][y]++;
            }
            if (y - 1 >= 0) {
                if (arr[x + 1][y - 1] != bomb) {
                    arr[x + 1][y - 1]++;
                }
            }
            if (y + 1 < arr.length) {
                if (arr[x + 1][y + 1] != bomb) {
                    arr[x + 1][y + 1]++;
                }
            }
        }
    }

    private static void printArray(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.printf("%3d",field[i][j]);
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