package test1.test2;

public class Main {
    public static void main(String[] args) {
        int razmer = 6;
        triangel(razmer);
    }

    private static void triangel(int inputRazmer) {
        String rez = "";
        String str = "                                         ";
        int kolSymbol = 1;
        for (int i = 1; i <= inputRazmer; i++) {
            String inputStr = str.substring(str.length() - (inputRazmer - i));
            for (int j = 1; j <= kolSymbol; j++) {
                inputStr += i;
                //System.out.println("str "+inputStr);
                rez = inputStr;

            }
            kolSymbol += 2;
            System.out.println(rez);
        }
    }
}
