package StringProblems;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowels {
    Set<Character> vowels = new HashSet<>(Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    public String reverseVowels1(String s) {
        char[] lowS = s.toCharArray();
        int i = 0;
        for (int j = s.length() - 1; j > i; ){
            boolean first = vowels.contains(lowS[i]);
            boolean last = vowels.contains(lowS[j]);
            if (!first && !last) {
                i++;
                j--;
            } else if (first && last) {
                char temp = lowS[i];
                lowS[i++] = lowS[j];
                lowS[j--] = temp;
            } else if (first) {
                j--;
            } else {
                i++;
            }
        }
        return String.valueOf(lowS);
    }

    public String reverseVowels2(String s) {
        char[] lowS = s.toCharArray();
        int i = 0;
        for (int j = s.length() - 1; j > i; ){
             while (j > i && !vowels.contains(lowS[i])) {
                 i++;
             }
             while (j > i && !vowels.contains(lowS[j])) {
                 j--;
            }
                char temp = lowS[i];
                lowS[i++] = lowS[j];
                lowS[j--] = temp;

        }
        return String.valueOf(lowS);
    }

    public static void main(String[] args) {
        ReverseVowels rv = new ReverseVowels();
        System.out.println(rv.reverseVowels2("leetcode"));
    }

}
