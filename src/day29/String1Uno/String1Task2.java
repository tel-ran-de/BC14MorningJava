package day29.String1Uno;

public class String1Task2 {
    public static void main(String[] args) {
        // postavitj vtoroe slovo v centr pervogo
        System.out.println(makeOutWord("<<>>", "Yay")); //→"<<Yay>>"
        System.out.println(makeOutWord("<<>>", "WooHoo")); //→"<<WooHoo>>"
        System.out.println(makeOutWord("[[]]", "word")); //→"[[word]]"
    }

    private static String makeOutWord(String str1, String str2) {
        String output = "";
        output += str1.substring(0, 2) + str2 + str1.substring(2);
        return output;
    }
}
