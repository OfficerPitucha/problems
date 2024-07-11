package StringProblems;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = new String[3];
        strs[0] = "aboba";
        strs[1] = "abiba";
        strs[2] = "abuba";
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        System.out.println(lcp.longestCommonPrefix(strs));
    }
    public String longestCommonPrefix(String[] strs) {
//        if (strs == null || strs.length == 0) return "";
//        String prefix = strs[0];
//        int prefixLen = prefix.length();
//        for (int i = 1; i < strs.length; i++){
//            String s = strs[i];
//            while (prefixLen > s.length() || !prefix.equals(s.substring(0,prefixLen))){
//                prefixLen--;
//                if (prefixLen == 0){
//                    return "";
//                }
//                prefix = prefix.substring(0, prefixLen);
//            }
//        }
//        return prefix;
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int i = 0;
        while (i < s1.length() && i < s2.length()){
            if (s1.charAt(i) == s2.charAt(i)){
                i++;
            } else break;
        }
        return s1.substring(0,i);
    }
}
