package day28.hm;

public class HomeWork {
    public static void main(String[] args) {
        /*System.out.println(withoutEnd2("Hello"));// → "ell"
        System.out.println(withoutEnd2("abc"));// → "b"
        System.out.println(withoutEnd2("ab"));// → ""*/

        /*Получив строку и int n, верните из строки строку,
        сделанную из первого и последнего n символов.
        Длина строки будет как минимум n.
*/
        System.out.println(nTwice("Hello", 2));// → "Helo"
        System.out.println(nTwice("Chocolate", 3));// → "Choate"
        System.out.println(nTwice("Chocolate", 1));// → "Ce"

    }

    private static String nTwice(String str, int input) {
        String output = "";


        return output;
    }

    private static String withoutEnd2(String str) {
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.length() >= 5) {
                return output + str.substring(2);
            }
            if (str.charAt(0) == 'a' && str.length() == 3) {
                return output + str.charAt(1);
            }
            if (str.length() <= 2) {
                return output;
            }
        }
        return output;
    }


}

