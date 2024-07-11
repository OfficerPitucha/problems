package StringProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IsomorphicStr {
    public static void main(String[] args) {
        IsomorphicStr i = new IsomorphicStr();
        System.out.println(i.isIsomorphic1("egg", "add"));
//        System.out.println(i.isIsomorphic("foo", "bar"));
//        System.out.println(i.isIsomorphic("paper", "title"));
//        System.out.println(i.isIsomorphic("badc", "baba"));
//        System.out.println(i.isIsomorphic1("bbbaaaba", "aaabbbba"));
    }
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, List<Integer>> positionsS = new HashMap<>();
        HashMap<Character, List<Integer>> positionsT = new HashMap<>();
        populatePositions(s, positionsS);
        populatePositions(t, positionsT);
        if (positionsS.values().size() != positionsT.values().size()) return false;
        for (List<Integer> positions : positionsT.values()){
           if (!positionsS.containsValue(positions)){
               return false;
           }
        }
        return true;
    }

    public void populatePositions(String t, HashMap<Character, List<Integer>> positionsT) {
        for (int i = 0; i < t.length(); i++) {
//                        int finalI = i;
//                        positionsT.computeIfAbsent(t.charAt(i), c -> new ArrayList<>(List.of(finalI)));
            if (!positionsT.containsKey(t.charAt(i))){
                positionsT.put(t.charAt(i), new ArrayList<>(List.of(i)));
            } else {
                positionsT.get(t.charAt(i)).add(i);
            }
        }
        System.out.println(positionsT);
    }

    public boolean isIsomorphic1(String s, String t) {
        // Create arrays to store the index of characters in both strings
        int[] indexS = new int[200]; // Stores index of characters in string s
        int[] indexT = new int[200]; // Stores index of characters in string t

        // Get the length of both strings
        int len = s.length();

        // If the lengths of the two strings are different, they can't be isomorphic
        if(len != t.length()) {
            return false;
        }

        // Iterate through each character of the strings
        for(int i = 0; i < len; i++) {
            // Check if the index of the current character in string s
            // is different from the index of the corresponding character in string t
            if(indexS[s.charAt(i)] != indexT[t.charAt(i)]) {
                return false; // If different, strings are not isomorphic
            }

            // Update the indices of characters in both strings
            indexS[s.charAt(i)] = i + 1; // updating index of current character
            indexT[t.charAt(i)] = i + 1; // updating index of current character
        }

        // If the loop completes without returning false, strings are isomorphic
        return true;
    }
}
