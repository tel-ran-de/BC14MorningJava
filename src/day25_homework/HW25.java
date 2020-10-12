package day25_homework;

public class HW25 {
    public static void main(String[] args) {
        //charAt(int index) returns the character at the specified index in a string.
        String myStr = "Hello";
        char result = myStr.charAt(0);
        System.out.println(result);

        //codePointAt(int index)returns the Unicode value of the character at the specified index in a string.
        //Return the Unicode of the first character in a string (the Unicode value of "H" is 72):
        String myStr1 = "Hello";
        int result1 = myStr1.codePointAt(0);
        System.out.println(result1);

        //codePointBefore(int index)returns the Unicode value of the character before the specified index in a string.
        String myStr2 = "Hello";
        int result2 = myStr2.codePointBefore(1);
        System.out.println(result2);

        //codePointCount(int beginIndex, int endIndex)returns the number of Unicode values found in a string.
        String myStr3 = "Hello";
        int result3 = myStr3.codePointCount(0, 5);
        System.out.println(result3);

        //compareToIgnoreCase(String str)compares two strings lexicographically, ignoring lower case and upper case differences.
        String myStr4 = "HELLO";
        String myStr5 = "hello";
        System.out.println(myStr4.compareToIgnoreCase(myStr5));

        //concat(String str)is used to join two or more strings.
        System.out.println("Hello.".concat("word"));

        //contains(CharSequence s)
        //Returns true if and only if this string contains the specified sequence of char values.
        String str1 = "Java and Coffee";
        String str2 ="and";
        System.out.println(str1.contains(str2)); //-> true

        //endsWith(String suffix)
        //Tests if this string ends with the specified suffix (boolean)
        String str3 = "Java work";
        String end_str = "rk";
        System.out.println(str3.endsWith(end_str)); //->true

        //equals(Object anObject)
        //Compares this string to the specified object. The result is true if and only if the argument
        // is not null and is a String object that represents the same sequence of characters as this object.
        String str4 = "Coffee";
        String str5 = "Coffee";
        System.out.println(str4.equals(str5));  //->true

        //equalsIgnoreCase(String anotherString)method compares two strings, ignoring lower case and upper case differences.
        //This method returns true if the strings are equal, and false if not.
        System.out.println("Hello".equalsIgnoreCase("HELLO")); // true
        System.out.println("Hello".equalsIgnoreCase("another string")); // false

        //indexOf(int ch) returns the position of the first occurrence of specified character(s) in a string.
        System.out.println("Hello my lovely planet.".indexOf("planet"));

        //isEmpty() checks whether a string is empty or not.
        System.out.println("hello".isEmpty());

        //length() length of a string
        System.out.println("The length of the txt string is: " + "txt".length());

        //replace(char oldChar, char newChar)searches a string for a specified character,
        // and returns a new string where the specified character(s) are replaced.
        System.out.println("hello".replace('l', 'p'));

        //startsWith(String prefix)
        //The startsWith() method tests if the substring of this string
        // beginning at the specified index starts with the specified prefix.
        System.out.println("Cat and dog".startsWith("Cat")); //-> true

        //substring(int beginIndex)returns a string that is a substring of this string.
        System.out.println("unhappy".substring(2));

        //toCharArray()converts a given string to a new character array.
        char[] arr = "hello".toCharArray();
        System.out.println(arr);

        //toLowerCase()
        //Converts all of the characters in this String to lower case using the rules of the default locale.
        System.out.println("MOBILE".toLowerCase());

        //toUpperCase()
        //Converts all of the characters in this String to upper case using the rules of the default locale.
        System.out.println("mobile".toUpperCase());

        //trim()
        //Returns a string whose value is this string, with any leading and trailing whitespace removed.
        System.out.println("        Here is an example.".trim());
    }
}


