package day28.hw28_Nadja;

public class HomeworkString28 {
    public static void main(String[] args) {
        System.out.println("*****************1*********************");
        System.out.println(withoutEnd2("Hello"));// → "ell"
        System.out.println(withoutEnd2("abc")); //→ "b"
        System.out.println(withoutEnd2("ab"));// → ""
        System.out.println("******************2********************");
        System.out.println(nTwice("Hello", 2));// → "Helo"
        System.out.println(nTwice("Chocolate", 3));// → "Choate"
        System.out.println(nTwice("Chocolate", 1));// → "Ce"
        System.out.println("******************3*******************");

        System.out.println(catDog("catfdog"));// → true
        System.out.println(catDog("catcat"));// → false
        System.out.println(catDog("1cat1cadodog"));// → true

        System.out.println("******************4*******************");
        System.out.println(xyzThere("abcxyz"));//true
        System.out.println(xyzThere("abc.xyz"));//false
        System.out.println(xyzThere("xyz.abc"));//true

        System.out.println("******************5*******************");

        System.out.println(mixString("abc", "xyz"));        // → "axbycz"
        System.out.println(mixString("Hi", "There"));     // → "HTihere"
        System.out.println(mixString("xxxx", "There"));  // → "xTxhxexre"
        System.out.println(mixString("xxxx", "aa"));

        System.out.println("******************String 03*******************");

        System.out.println(countYZ("fez day"));// → 2
        System.out.println(countYZ("day fez"));// → 2
        System.out.println(countYZ("day fyyyz"));// → 2
        System.out.println(countYZ("day23fyyyz43"));// → 2

    }

    //Given a string, count the number of words ending in ‘y’ or ‘z’ – so the ‘y’ in “heavy” and the ‘z’ in “fez” count,
// but not the ‘y’ in “yellow” (not case sensitive). We’ll say that a y or z is at the end of a word if there is not
// an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char
// is an alphabetic letter.)
    private static int countYZ(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'z' || str.charAt(i) == 'y')
                if (str.length() - 1 != i) {
                    if (!Character.isLetter(str.charAt(i + 1))) {
                        num++;
                    }
                } else num++;
        }
        return num;
    }

    private static String mixString(String strA, String strB) {
        String output = "";
        if (strA.length() < strB.length()) {
            for (int i = 0; i < strA.length(); i++) {
                output += strA.charAt(i) + "" + strB.charAt(i);
            }
            output += strB.substring(strA.length());
        }
        if (strA.length() == strB.length()) {
            for (int i = 0; i < strA.length(); i++) {
                output += strA.charAt(i) + "" + strB.charAt(i);
            }
        }
        if (strA.length() > strB.length()) {
            for (int i = 0; i < strB.length(); i++) {
                output += strA.charAt(i) + "" + strB.charAt(i);
            }
            output += strA.substring(strB.length());
        }
        return output;
    }

    private static boolean xyzThere(String str) {
        String strXYZ = "xyz";
        int index = str.indexOf(strXYZ);
        if (index > 0) {
            return (str.charAt(index - 1) != '.');
        } else return index == 0;
    }

    private static boolean catDog(String str) {
        String cat = "cat";
        String dog = "dog";
        int indexCat = str.indexOf(cat);
        int indexDog = str.indexOf(dog);
        return (indexCat >= 0 && indexDog >= 0);
    }

    private static String nTwice(String str, int n) {
        //Given a string and an int n, return a string made of the first and last n chars from the string.
        // The string length will be at least n.
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    private static String withoutEnd2(String str) {
        //Given a string, return a version without both the first and last char of the string.
        // The string may be any length, including 0.
        String output = "";
        if (str.length() == 0) {
            return output;
        } else
            output = str.substring(1, str.length() - 1);
        return output;
    }
}
