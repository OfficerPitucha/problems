package StringProblems;

public class ValidPalindrome {
    public static void main(String[] args) {
        ValidPalindrome vp = new ValidPalindrome();
        System.out.println(vp.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(vp.isPalindrome("race a car"));
        System.out.println(vp.isPalindrome(".,"));
        System.out.println(vp.isPalindrome("aa"));
        System.out.println(vp.isPalindrome("abba"));
        System.out.println(vp.isPalindrome("ab_a"));
    }
    public boolean isPalindrome(String s) {
        if (s.length() == 1) return true;
//        Pattern pattern = Pattern.compile("\\W");
//        Matcher matcher = pattern.matcher(s);
        String newS = s.replaceAll("[^\\w&&[^_*]]", "").toLowerCase();
        if (newS.isEmpty() || newS.matches("^(.)\\1*$")) return true;
        int len = newS.length();
        return newS.substring(0, len / 2).equals(new StringBuilder(newS.substring(len / 2 + len % 2, len)).reverse().toString());
    }
}
