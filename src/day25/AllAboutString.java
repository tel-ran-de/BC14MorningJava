package kw6.day25;

import static kw2.day6.ClassWork3.split;

public class AllAboutString {
    public static void main(String[] args) {
        String str1 = "Это тестовая строка, которая меня сегодня точно заебет";
        System.out.println("charAt от 9-го символа =" + str1.charAt(9));
        //С помощью charAt(index) можно вывести букву по
        // порядковому номеру, начиная с 0.
        //Например, порядковый номер 9 строки str - это буква 'в'.
        split();
        System.out.println("codePointAt от 9-ти / Unicode 9-го символа, то есть 'в' = " + str1.codePointAt(9));
        //codePointAt переводит порядковый номер строки сразу в Unicode.
        //таким образом перепрыгивает один шаг. 9-я буква - это 'в', номер
        //в Unicode - 1074
        split();
        System.out.println("codePointBefore от 9 / Unicode предыдущего символа, то есть 'o'= " + str1.codePointBefore(9));
        //codePointBefore - это как codePointAt, только -1. В нашем случае - это буква о - 1086.
        split();
        System.out.println(str1.codePointCount(8, 15));
        //codePointCount(int начало, int конец) - высчитывает значение от заданного начала и заданного конца
        //пробелы и знаки препинания также учитываются
        split();
        String str2 = "Это тестовая строка, но она другая";
        String str3 = "ЭТО ТЕСТОВАЯ СТРОКА, НО ОНА ";
        System.out.println(str2.compareToIgnoreCase(str3));
        //compareToIgnoreCase сравнивает две строки и забивает болт
        //большая или маленькая там буква. Если полное совпадение - выдает 0;
        //Сравнивает две строки по лексикографическому принципу по Unicode.
        split();
        System.out.println(str1.concat(str2));
        //concat - это конкатинация двух строк. Это тоже самое, что str1 + str2
        split();
        System.out.println(str1.contains("меня"));
        //contains сравнивает две строки и выдает true или false.
        //например есть ли строка "меня" в строке str1. Ответ - true.
        split();
        System.out.println(str1.endsWith("заебет"));
        //endsWith - сравнивает окончание строки. Если совпадает, выдает true, если нет - false.
        split();
        System.out.println(str1.equals(str2));
        //equals(Object anObject) - сравнивает объекты и выдает false или true
        split();
        System.out.println(str1.equalsIgnoreCase(str2));
        //equalsIgnoreCase() - сравнивает строки игнорируя большие буквы. Выдает false, true
        split();
        System.out.println(str1.indexOf('в'));
        //Выдает порядковый номер символа. Это как charAt, только наоборот.
        split();
        System.out.println(str1.isEmpty());
        //isEmpty() проверяет, пустая ли строка. Если да, выдает true, если нет false.
        split();
        System.out.println(str1.length());
        //length() выдает количество символов в строке
        String str4 = str1.replace('с', 'С');
        System.out.println(str4);
        //replace() - замена символов на другие символы. Заменяет все символы, не только один.
        split();
        System.out.println(str1.startsWith("Это"));
        //startsWith() - начинается ли строка (если без порядкового номера)
        //то с самого начала
        split();
        System.out.println(str1.substring(0, 7));
        //С какого символа показывать строку. Если указываем конец, будет
        //показана строка от и до
        split();
        char[] result = str1.toCharArray();
        for (int i = 0; i < result.length; i++)
            System.out.println("Element [" + i + "]: " + result[i]);
        //toCharArray() переделывает строку в массив чаров.
        split();
        System.out.println(str1.toLowerCase());
        //toLowerCase() - делаем всю строку строчными буквами
        split();
        System.out.println(str1.toUpperCase());
        //toUpperCase() - делаем всю строку заглавными буквами
        split();
        System.out.println(str1.trim());
        //trim() - метод, который удаляет пробелы в начале и конце строки.
        //отличный метод, который очень нужен бабулькам, ставящих абзацы.
    }
}
