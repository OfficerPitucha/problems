package StringProblems;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        WordPattern wp = new WordPattern();
        System.out.println(wp.wordPattern("abba", "dog cat cat dog"));
    }
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.trim().split("\\s");
        if (str.length != pattern.length()) return false;
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if (!map.get(pattern.charAt(i)).equals(str[i])) {
                    return false;
                    }
                } else if (map.containsValue(str[i])) {
                return false;
                } else {
                    map.put(pattern.charAt(i), str[i]);
                }
        }
        return true;
    }
}
