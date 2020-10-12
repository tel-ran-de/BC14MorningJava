package day25.hw25Anton;


public class HW25_Anton {
    public static void main(String[] args) {

        /*charAt(int index) codePointAt(int index)
        codePointBefore(int index) codePointCount(int beginIndex, int endIndex)
        compareToIgnoreCase(String str)concat(String str)
        contains(CharSequence s)endsWith(String suffix)
        equals(Object anObject)equalsIgnoreCase(String anotherString)
        indexOf(int ch)isEmpty()
        length()replace(char oldChar, char newChar)
        startsWith(String prefix)substring(int beginIndex)
        toCharArray()toLowerCase()
        toUpperCase() trim()*/
        String example = "  HeLlo HoW aRe YoU?  ";

        myLovelyCharAt(example);
        myCodePointAt(example);
        myCodePointBefore(example);
        myCodePointCount(example);
        myCompareToIgnoreCase(example);
        myConcat(example);
        myContains(example);
        myEndsWith(example);
        myEquals(example);
        myEqualsIgnoreCase(example);
        myIndexOf(example);
        myIsEmpty(example);
        myLength(example);
        myReplace(example);
        myStartsWith(example);
        mySubstring(example);
        myToCharArray(example);
        myToLowerCase(example);
        myToUpperCase(example);
        myTrim(example);


    }

    private static void myTrim(String str) {
        System.out.println("myTrim: " + str.trim()); // cuts of empty spaces at both ends of given String
    }

    private static void myToUpperCase(String str) {
        System.out.println("myToUpperCase: " + str.toUpperCase());// sets all Alphabetic Chars to upper case
    }

    private static void myToLowerCase(String str) {
        System.out.println("myToLowerCase: " + str.toLowerCase());// sets all Alphabetic Chars to lower case
    }

    private static void myToCharArray(String str) {
        System.out.print("myToCharArray: ");
        char[] newCharArray = str.toCharArray();
        for (int i = 0; i <str.length() ; i++) {
            System.out.print(newCharArray[i]);
        }
        System.out.println();
        // converts given String to a char array
    }

    private static void mySubstring(String str) {
        System.out.println("mySubstring: " + str.substring(4, 8));// using a piece of given String, starting
        // at first given index and ending before the second given index
    }

    private static void myStartsWith(String str) {
        System.out.println("myStartsWith: " + str.startsWith("hi"));// is answering with a boolean
        // and tells, if given String is starting with the Prefix
    }

    private static void myReplace(String str) {
        System.out.println("myReplace: " + str.replace('o', 'p'));// is replacing
        //all chars, which are the same like the first given char, to the second char
    }

    private static void myLength(String str) {
        System.out.println("myLength: " + str.length());//is giving an int number
        //with the count of chars containing given String
    }

    private static void myIsEmpty(String str) {
        System.out.println("myIsEmpty: " + str.isEmpty());//is giving an answer
        //in boolean, if given String is empty
    }

    private static void myIndexOf(String str) {
        System.out.println("myIndexOf: " + str.indexOf("Ho"));//is giving the indexnumber
        //of the given String, where the asked piece of String begins first
    }

    private static void myEqualsIgnoreCase(String str) {
        System.out.println("myEqualsIgnoreCase: " + str.equalsIgnoreCase("hello"));
        //is comparing two Strings and is answering with a boolean, if both Strings are the same
        //ignoring the cases of both Strings
    }

    private static void myEndsWith(String str) {
        System.out.println("myEndsWith: " + str.endsWith("hi"));// is answering with a boolean
        // and tells, if given String is ending with the Suffix
    }

    private static void myContains(String str) {
        System.out.println("myContains: " + str.contains("HoW"));//is given an answer
        //as boolean, if given String contains asked piece of String or Char
    }

    private static void myConcat(String str) {
        System.out.println("myConcat: " + str.concat(" good"));//is adding a second String
        // to our given String
    }

    private static void myCompareToIgnoreCase(String str) {
        System.out.println("myCompareToIgnoreCase: " + str.compareToIgnoreCase("hi"));//compares two String lexicographically
        //returning the difference of the unicode number of the first not equal char, and is
        //ignoring Cases
    }

    private static void myCodePointCount(String str) {
        System.out.println("myCodePointCount: " + str.codePointCount(0, 12));// is giving the count of
        // unicode chars, i don't know the difference between this and
        //str.substring(0,12).length
    }

    private static void myEquals(String str) {
        System.out.println("myEquals: " + str.equals("good"));// is answering with a boolean
        // if given String is the same like the second String
    }

    private static void myCodePointBefore(String str) {
        System.out.println("myCodePointBefore: " + str.codePointBefore(3));// is answering with the unicode number
        //of the char 1 place before given index
    }

    private static void myCodePointAt(String str) {
        System.out.println("myCodePointAt: " + str.codePointAt(3));// is answering with the unicode number
        //of the char at given index
    }

    private static void myLovelyCharAt(String str) {
        System.out.println("myLovelyCharAt: " + str.charAt(3));// is answering with the char at given index
    }
}
