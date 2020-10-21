package day27.hw_Nadja;

public class HomeWork27 {
    public static void main(String[] args) {
        System.out.println(plusOut("12xy34", "xy"));// → "++xy++"
        System.out.println(plusOut("12xy34", "1"));// → "1+++++"
        System.out.println(plusOut("xy12xy34xyabcxy", "xy"));// → "xy++xy++xy+++xy"
    }

    private static String plusOut(String str, String searchStr) {
        String outputStr = "";
        String changStr = "+";
        int i = 0;
        while (i < str.length()) {

            int indexStart = str.indexOf(searchStr, i);
            if (indexStart == 0) {
                outputStr=outputStr+searchStr;
                i++;
                continue;
            } else if (indexStart > 0) {
                int tempIndex = indexStart + searchStr.length();
                for (int j = i; j < indexStart; j++) {
                    outputStr += changStr;
                }
                outputStr = outputStr + searchStr;
                i = tempIndex;
            } else if (indexStart<0){
                outputStr=outputStr+changStr;
                i++;
            }
        }
        return outputStr;
    }
}
