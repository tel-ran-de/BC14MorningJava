package day27.HW27_Andris;

public class HW27_Task2 {
    public static void main(String[] args) {
// 1. Находим где именно в строке у нас находится наш элемент
//2. Пробегаем через цикл по строке
//3. Если символ равен нашему элементу, то максимум 2 элеманта до
// и максимум 3 элемента после превращаем в звездочку.
//4. Возвращаем звездочки и наш элемент

        System.out.println(plusOut("12xy34", "xy")); // → "++xy++"
        System.out.println(plusOut("12xy34", "1")); // → "1+++++"
        System.out.println(plusOut("12xy34xyabcxy", "xy")); // → "++xy++xy+++xy"
    }

    private static String plusOut(String input, String element) {
        String result = "";
        char plusSign = '*';
        int elementStart = input.indexOf(element); // we find the index position of our element
        int countSymbolsStart = elementStart; // find the amount of symbols before the element
        for (int i = 0; i < input.length(); i++) {
            if (input(i) = element) {
                input[i - 1] == plusSign && input [i-2] == plusSign
            }

        }

        return result;
    }
}
