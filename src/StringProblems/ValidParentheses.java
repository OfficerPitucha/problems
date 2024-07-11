package StringProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        System.out.println(vp.isValid("(){}[]"));

    }
    public boolean isValid(String s){
        List<Character> close = new ArrayList<>(Arrays.asList(')', '}', ']'));
        List<Character> parentheses = new ArrayList<>(Arrays.asList('(', ')'));
        List<Character> curly = new ArrayList<>(Arrays.asList('{', '}'));
        List<Character> square = new ArrayList<>(Arrays.asList('[', ']'));
        int c = 0;
        int p = 0;
        int q = 0;
        char first = s.charAt(0);
        if (close.contains(first)) return false;
        for (int j = 0; j < s.length(); j+=2){
            if (j+1 < s.length()){
                if (!(parentheses.contains(s.charAt(j)) && parentheses.contains(s.charAt(j+1)))
                        && !(curly.contains(s.charAt(j)) && curly.contains(s.charAt(j+1)))
                        && !(square.contains(s.charAt(j)) && square.contains(s.charAt(j+1)))) return false;
            }
        }
        for (int i = 0; i < s.length(); i++){
            switch (s.charAt(i)){
                case '{' -> c++;
                case '}' -> c--;
                case '(' -> p++;
                case ')' -> p--;
                case '[' -> q++;
                case ']' -> q--;
                default -> {
                    return false;
                }
            }
            if (c < 0 || p < 0 || q < 0) return false;
        }
        return c == 0 || p == 0 || q == 0;
    }
}
