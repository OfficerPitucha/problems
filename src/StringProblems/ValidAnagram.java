package StringProblems;

public class ValidAnagram {
    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();
        System.out.println(va.isAnagram("anagram", "nagaram"));
    }
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] charsS = new int[26];
        int[] charsT = new int[26];
        for (int i = 0; i < s.length(); i++){
//            System.out.println("s: " + s.charAt(i) + ", " +  charsS[s.charAt(i) % 97] + " \nt: " + t.charAt(i) + ", " + charsT[t.charAt(i) % 97]);
            charsS[s.charAt(i) % 97] += 1;
            charsT[t.charAt(i) % 97] += 1;
        }
        for (int j = 0; j < s.length(); j++){
            if (charsS[t.charAt(j) % 97] != charsT[t.charAt(j) % 97]) return false;
        }
        return true;
    }
}
