package StringProblems;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charsS = new int[26];
        int[] charsT = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            if (i < ransomNote.length()) {
                charsS[ransomNote.charAt(i) - 'a'] += 1;
            }
            charsT[magazine.charAt(i) - 'a'] += 1;
        }
        for (int j = 0; j < ransomNote.length(); j++) {
            if (charsS[ransomNote.charAt(j) - 'a'] > charsT[ransomNote.charAt(j) - 'a']) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        RansomNote rn = new RansomNote();
        System.out.println(rn.canConstruct("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
    }
}
