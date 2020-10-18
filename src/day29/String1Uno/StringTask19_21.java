package day29.String1Uno;

public class StringTask19_21 {
    public static void main(String[] args) {
/* Given two strings, append them together (known as "concatenation") and return the result.
However, if the concatenation creates a double-char, then omit one of the chars,
so "abc" and "cat" yields "abcat". */

        //System.out.println(conCat("abc", "cat")); //→"abcat"
        //System.out.println(conCat("dog", "cat")); //→"dogcat"
        //System.out.println(conCat("abc", "")); //→"abc"

        System.out.println();
/* Given a string, return true if the first 2 chars in the string also
 appear at the end of the string, such as with "edited". */

        //System.out.println(frontAgain("edited")); //→ true
        //System.out.println(frontAgain("edit")); //→ false
        //System.out.println(frontAgain("ed")); //→ true

        System.out.println(withoutX("xHix")); //→ "Hi"
        System.out.println(withoutX("xHi")); //→ "Hi"
        System.out.println(withoutX("Hxix")); //→ "Hxi"
    }

    private static String withoutX(String str) {
        if (str.charAt(0) == 'x') {
            str = str.substring(1, str.length());

            if (str.charAt(str.length() - 1) == 'x') {
                str = str.substring(0, str.length() - 1);
            } else {
                if (str.startsWith("x") && str.endsWith("x"))
                    str = str.substring(1, str.length()) + str.substring(0, str.length() - 1);
            }

        }
        return str;
    }

}


    /* private static boolean frontAgain(String str) {
        return (str.substring(0, 2).equals(str.substring(str.length() - 2, str.length())));
    }

    private static String conCat(String a, String b) {
        if (a.length() > 0 && b.length() > 0 && b.charAt(0) == a.charAt(a.length() - 1)) {
            b = b.substring(1);
            return a + b;
        }
        return a + b;
    }
}

*/




        /* if (a.length() == 0 || b.length() == 0) {
            return a + b;
            else if ((a.substring(a.length() - 1, a.length())).equals(b.substring(0, 1))) {
                return a + b.substring(1, b.length());
                else{
                    return a + b; */
