package HW28;

public class String01_17 {
    public static void main(String[] args) {
        System.out.println(nTwice("Hello", 2));// → "Helo"
        System.out.println(nTwice("Chocolate", 3)); //→ "Choate"
        System.out.println(nTwice("Chocolate", 1)); //→ "Ce"
    }

    private static String nTwice(String str, int number) {
        if (str.length() > 0 && number > 0) {
            return str.substring(0, number) + str.substring((str.length() - 1) - number + 1);
        } else return str;
    }
}
