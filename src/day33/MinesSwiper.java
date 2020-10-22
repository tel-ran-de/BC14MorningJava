package day33;

public class MinesSwiper {
    public static void main(String[] args) {
        // Минное поле
        // 10*10 на нём должно быть 10% бомбочек
        // Стринг [][]  : обычное поле либо пробелы, либо минусы, а бомбочка у нас будет "*";
        String[][] miner = new String[10][10];
        minesSwiper(miner, 10);
        printMySwiper(miner);
    }

    private static void printMySwiper(String[][] miner) {
        for (String[] simpleArray : miner) {
            for (String element : simpleArray) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static void minesSwiper(String[][] miner, int percent) {
        int fieldCount = miner.length * miner[0].length;
        int bombCount = fieldCount * percent / 100;
        String bomb = "*";
        String empty = "-";
        for (int i = 0; i < miner.length; i++) {
            for (int j = 0; j < miner[i].length; j++) {
                miner[i][j] = empty;
                System.out.print("x " + i);
                System.out.println("y" + j);
            }
        }
        int count = 0;
        while (count < bombCount) {
            int x = (int) (Math.random() * miner.length);
            int y = (int) (Math.random() * miner[x].length);
            if (!(miner[x][y].equals(bomb))) {
                miner[x][y] = bomb;
                count++;
            }
        }
    }
}
