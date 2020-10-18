package HW28;

public class String01_16 {
    public static void main(String[] args) {
        System.out.println(withoutEnd2("Hello")); //→ "ell"
        System.out.println(withoutEnd2("abc")); //→ "b"
        System.out.println(withoutEnd2("ab")); //→ ""
    }

    private static String withoutEnd2(String str) {
        if (str.length() > 2) return str.substring(1, str.length() - 1);
        else return "";
    }
}
