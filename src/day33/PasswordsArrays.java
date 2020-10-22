package day33;

import java.util.Arrays;

public class PasswordsArrays {
    public static void main(String[] args) {
        String passExample = createPassword(10);
        System.out.println(passExample);
        String[] passArrays = createPassArrays(7, 10);
        System.out.println(Arrays.toString(passArrays));
    }

    private static String[] createPassArrays(int anzahl, int laenge) {
        String[] output = new String[anzahl];
        for (int i = 0; i < anzahl; i++) {
            output[i] = createPassword(laenge);
        }
        return output;
    }

    private static String createPassword(int size) {
        String output = "";
        for (int i = 0; i < size; i++) {
            output += (char) (Math.random() * (90 - 65) + 65);
        }
        return output;
    }
}
