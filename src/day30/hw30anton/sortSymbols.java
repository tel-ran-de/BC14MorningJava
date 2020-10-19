package day30.hw30anton;

public class sortSymbols {
    public static void main(String[] args) {
        char[] unsorted = new char[]{'§', '&', '3', 'n', 'q', 'a', ')', 'ä', '!', '(', '+', '€'};
        char[] plsSort = copyCharArr(unsorted);
        bubbleSortChar(plsSort);
        printCharArray(plsSort);
    }

    public static void printCharArray(char[] arr) {
        System.out.print("[ ");
        for (char element :
                arr) {
            System.out.print(element + " ");
        }
        System.out.println("]");
    }

    private static void bubbleSortChar(char[] arr) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    unsorted = true;
                    char temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    public static char[] copyCharArr(char[] arr) {
        char[] output = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            output[i] = arr[i];
        }
        return output;
    }
}
