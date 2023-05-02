package test;
import java.util.*;

class yiyi {
    
    private static char getFirstMissingChar(String str, int strLength) {
        final int MAX_CHARS = 26;
        boolean[] present = new boolean[MAX_CHARS];
        for (int i = 0; i < strLength; i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                present[str.charAt(i) - 'A'] = true;
            } else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                present[str.charAt(i) - 'a'] = true;
            }
        }
        for (int i = 0; i < MAX_CHARS; i++) {
            if (present[i] == false) {
                return (char) (i + 'a');
            }
        }
        return '\0';
    }
    
    public static void main(String[] args) {
        String str = "baADfc";
        char missing = GFG.getFirstMissingChar(str, str.length());
        if (missing != '\0') {
            System.out.println("The missing character is: " + missing);
        } else {
            System.out.println("No character is missing");
        }
    }
}
