package homeworkday30;

public class HomeWork {
    public static void main(String[] args) {
        char[] symbols = new char[] {'§', '!', '6', '?', '=', '%', '$'};
        char[] copy = CopyCharArr(symbols);
        BubbleSortChar(copy);
        MyPrintCharArray(copy);
    }

    public static void MyPrintCharArray(char[] input) {
        for (char element:input) {
            System.out.print(element + " ");
        }
    }

    private static void BubbleSortChar(char[] unsortedArr) {
        int count = 0;
        for (int i = 0; i <unsortedArr.length -1 ; i++) {
            if (unsortedArr[i] > unsortedArr[i+1]){
                char temp = unsortedArr[i];
                unsortedArr[i] = unsortedArr[i +1];
                unsortedArr[i +1] = temp;
                count++;
            }

        }
        if (count>0){
            BubbleSortChar(unsortedArr);
        }
    }

    public static char[] CopyCharArr(char[] symbols) {
        char [] output = new char[symbols.length];
        for (int i = 0; i <symbols.length ; i++) {
            output[i] = symbols[i];


        }
        return output;
    }
}
