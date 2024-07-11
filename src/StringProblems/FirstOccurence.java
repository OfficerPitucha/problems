package StringProblems;

public class FirstOccurence {
    public static void main(String[] args) {
        FirstOccurence fo = new FirstOccurence();
        System.out.println(fo.strStr("a", "a"));
    }
    public int strStr(String haystack, String needle) {
        int len = needle.length();
        for (int i = 0; i + len <= haystack.length(); i++){
            if (haystack.substring(i, i + len).equals(needle))
                return i;
        }
        return -1;
    }
}
