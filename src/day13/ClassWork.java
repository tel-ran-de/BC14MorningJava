package day13;

public class ClassWork {
    public static void main(String[] args) {
        //myCharAt();
        //myCodePoint();
        // myCodePointBefore();
        //myCodePointCount();
        //myCompareTo();
        //myContains();
        // myEquals();
        myTrim();

    }

    private static void myTrim() {
        String test = "    Я памятник воздвиг себе нерукотворный        ";
        System.out.println(test);
        System.out.println(test.trim());
    }

    private static void myEquals() {
        String test1 = "Василий";
        String test2 = "Vasilij";
        System.out.println(test1.equals(test2));
    }

    private static void myContains() {
        String hm = "Василий";
        String etalon = "й";
        System.out.println("василий".contains("й"));
        System.out.println(hm.contains(etalon));
        System.out.println(hm.endsWith(etalon));
    }

    private static void myCompareTo() {
        String str1 = "МОСКВА";
        String str2 = "москва";
        String str3 = "Z";

        int result1 = str1.compareTo(str2);
        int result2 = str2.compareToIgnoreCase(str1);
        System.out.println(result1);
        System.out.println(result2);
    }

    private static void myCodePointCount() {
        String str = "I LOVE JAVA";
        int count = str.codePointCount(2, 5);
        System.out.println(count);
    }

    private static void myCodePointBefore() {
        String str = "I LOVE JAVA";
        System.out.println(str);
        System.out.println(str.codePointBefore(1));
    }

    private static void myCodePoint() {
        String hm = "Василий";
        int test = hm.codePointAt(1);
        System.out.println(test);
    }

    private static void myCharAt() {
        String hausmaster = "Василийеориктгйхредоситгуйрдесоитгуредоитгуйхердоитзгурей";
        int size = hausmaster.length();
        System.out.println(hausmaster.charAt(size - 1));
        String output
                = "" + hausmaster.charAt(0)
                + hausmaster.charAt(size - 1);
    }
}
