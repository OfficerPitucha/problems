package StringProblems;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int len1 = t.length();
        int len2 = s.length();
        if (len1 < len2) return false;
        if (len1 == 1 && len2 == 1 && !s.equals(t)) return false;
//        StringBuilder s1 = new StringBuilder(s);
        StringBuilder t1 = new StringBuilder(t);
        s += "]";
        t1.append("]");
        for (int i = 0; i < len2; i++){
            int curr = t1.lastIndexOf(s.charAt(i)+"");
            int next = t1.lastIndexOf(s.charAt(i + 1)+"");
            if (curr == -1 || next < curr) return false;
            t1.deleteCharAt(curr);
        }
        return true;
    }

    public static void main(String[] args) {
        IsSubsequence s = new IsSubsequence();
        System.out.println(s.isSubsequence("leetcode", "\"leetcode\""));
    }
}
