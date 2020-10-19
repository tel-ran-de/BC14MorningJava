package homeworkday30;

public class HomeWorkAlphabet {
    public static void main(String[] args) {
        char [] alphabet = new char[]{ 'w', 'f', 'l' , 'a', 'r', 'm'};
        char [] rusAlphabet = new char []{ 'в', 'е', 'г', 'ш' ,'л', 'д', 'а' ,'ч', };
        /*bubbleSortAlphabet(alphabet);
        MyPrintChar(alphabet);*/
        bubbleSortAlphabet(rusAlphabet);
        MyPrintChar(rusAlphabet);
    }

    private static void MyPrintChar(char[] input) {
        for (char element : input) {
            System.out.print( element + " ");

        }
    }

    private static void bubbleSortAlphabet(char[] input) {
            boolean unsort = true;
            while (unsort){
                unsort = false;
                for (int i = 0; i < input.length -1 ; i++) {
                    if (input[i] > input[i +1]){
                        char temp = input[i];
                        input[i] = input[i+1];
                        input[i +1] = temp;
                        unsort = true;
                    }

                }
            }
    }
}
