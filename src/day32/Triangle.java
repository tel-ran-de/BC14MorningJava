package day32;


public class Triangle {
    public static void main(String[] args) {
        firstTriangle(10);
    }

    private static void firstTriangle(int number) {
        String line = "";
        String star = "*";
        for (int i = 0; i <number ; i++) {
            line += star;
        }
        for (int i = 0; i <number ; i++) {
            line = line.substring(1);
            //line = line.substring(0, line.length()-1);
            System.out.println(line);
        }
    }
}
