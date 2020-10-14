package day27_homework;

public class Task14 {
    public static void main(String[] args) {
        System.out.println(plusOut("12xy34", "xy")); //→ "++xy++"
        System.out.println(plusOut("12xy34", "1")); //→ "1+++++"
        System.out.println(plusOut("12xy34xyabcxy", "xy")); //→ "++xy++xy+++xy"
    }

    private static String plusOut(String whereToSearch, String whatToSearch) {
        String output = "";
        for (int i = 0; i < whereToSearch.length(); i++) {
            String restToSearch = whereToSearch.substring(i);
            if (restToSearch.startsWith(whatToSearch)) {
                output += whatToSearch;
                i += whatToSearch.length() - 1;
            } else {
                output += "+";
            }
        }
        return output;
    }
}
