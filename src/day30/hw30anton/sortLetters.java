package day30.hw30anton;

public class sortLetters {
    public static void main(String[] args) {
        String alphabeticKeyGerman = "AÄBCDEFGHIJKLMNOÖPQRSTUÜVWXYZaäbcdefghijklmnoöpqrsßtuüvwxyz";
        String alphabeticKeyRussian = "pls Enter Cyrillic alphabet in right order";
        String test="lmniaähsÄndaijqijdkm";
        char[] plsSort = sortSymbols.copyCharArr(test.toCharArray());
        bubbleSortLetters(plsSort,alphabeticKeyGerman);
        sortSymbols.printCharArray(test.toCharArray());
        sortSymbols.printCharArray(plsSort);
    }

    private static void bubbleSortLetters(char[] arr,String key) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (key.indexOf(arr[i]) > key.indexOf(arr[i + 1])) {
                char temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count++;
            }
        }
        if (count > 0) {
            bubbleSortLetters(arr,key);
        }

    }
}
