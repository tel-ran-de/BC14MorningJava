package Homework;

import static day06.Classwork2.split;

public class HomeWork {
    public static void main(String[] args) {
        /*System.out.println(withoutEnd2("Hello"));// → "ell"
        System.out.println(withoutEnd2("abc"));// → "b"
        System.out.println(withoutEnd2("ab"));// → ""
        split();
        System.out.println(nTwice("Hello", 2));// → "Helo"
        System.out.println(nTwice("Chocolate", 3));// → "Choate"
        System.out.println(nTwice("Chocolate", 1));// → "Ce"
        split();
        System.out.println(catDog("catdog"));// → true
        System.out.println(catDog("catcat"));// → false
        System.out.println(catDog("1cat1cadodog"));// → true
        System.out.println(catDog("catsatrecatkmdldcatjdhdidogkshjdogkiwuwhdog"));*/
       /* split();
        System.out.println(xyzThere("abcxyz"));// → true
        System.out.println(xyzThere("abc.xyz"));// → false
        System.out.println(xyzThere("xyz.abc"));// → true
        System.out.println(xyzThere("xyzkdm"));
        System.out.println(xyzThere(".xyzabc"));*/

        split();
        /*System.out.println(mixString("abc", "xyz"));// → "axbycz"
        System.out.println(mixString("Hi", "There")); //→ "HTihere"
        System.out.println(mixString("xxxx", "There"));// → "xTxhxexre"*/
        split();
        System.out.println(countYZ("fez day"));// → 2
        System.out.println(countYZ("day fez"));// → 2
        System.out.println(countYZ("day fyyyz"));// → 2


    }

    private static int countYZ(String str) {
        int cont = 0;
        char empty = ' ';
        char z = 'z';
        char y = 'y';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == z && str.charAt(i + 1) == empty ||
                    str.charAt(i)== y && str.charAt(i + 1) == empty ) {
                cont++;
            }if (str.charAt(str.length() - 1)== z|| str.charAt(str.length() - 1) == y){
                cont++;
            }

        }return cont;
    }





    private static String mixString(String str1, String str2) {
        String output = "";
        String result = "";
        String output1 = "";
        for (int i = 0; i < str1.length(); i++) {
            result = result + str1.charAt(i);
        }
        for (int j = 0; j < str2.length(); j++) {
            result = result + str2.substring(str1.length());

        }
        return result;
    }


    private static boolean xyzThere(String str) {
        String xyz = "xyz";
        char punkt = '.';

        for (int i = 0; i < str.length(); i++) {
            if (str.contains(xyz) && str.indexOf(xyz) > 0 &&
                    str.charAt(str.indexOf(xyz) - 1) == punkt) {
                return false;
            }

        }
        return true;
    }

    private static boolean catDog(String input) {
        String cat = "cat";
        String dog = "dog";
        int countCat = 0;
        int countDog = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.contains(cat)) {
                countCat++;
            }
            if (input.contains(dog)) {
                countDog++;
            }
            if (countCat == countDog) {
                return true;
            }

        }


        return false;
    }

    private static String nTwice(String str, int n) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == n)
                result = str.substring(0, n) + str.substring(str.length() - n);

        }
        return result;
    }


    private static String withoutEnd2(String str) {
        String output = "";
        return output + str.substring(1, str.length() - 1);

    }
}



