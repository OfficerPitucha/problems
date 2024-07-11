package StringProblems;

public class Difference {
    public char findTheDifference(String s, String t) {
        int[] alphabet = new int[26];
        for (char ch : t.toCharArray()){
            alphabet[ch - 'a']++;
        }
        for (char ch : s.toCharArray()){
            alphabet[ch - 'a']--;
        }
        for (int i = 0; i < alphabet.length; i++){
            if (alphabet[i] != 0) return (char) (i + 'a');
        }
        return '.';
    }

    public char findTheDifference1(String s, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++){
            alphabet[t.charAt(i) - 'a']++;
            alphabet[s.charAt(i) - 'a']--;
        }
        alphabet[t.charAt(t.length() - 1) - 'a']++;
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] != 0) return (char) (i + 'a');
        }
        return '.';
    }

    public static void main(String[] args) {
        Difference dif = new Difference();
        System.out.println(dif.findTheDifference("abcd", "abcde"));
    }
}
