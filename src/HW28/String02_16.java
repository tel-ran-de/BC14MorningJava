package HW28;

public class String02_16 {
    public static void main(String[] args) {
        System.out.println(xyzThere("abcxyz")); //→ true
        System.out.println(xyzThere("abc.xyz")); //→ false
        System.out.println(xyzThere("xyz.abc")); // → true
        System.out.println(xyzThere("sgdhsgd")); // -> false
        System.out.println(xyzThere(".xyzxyz")); // -> true
    }

    private static boolean xyzThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'y' && str.charAt(i + 2) == 'z') {

                if (i == 0 || str.charAt(i - 1) != '.') return true;
                i += 2;
            }
        }
        return false;
    }
}
