package StringProblems;

import java.util.*;

public class romanToInt {
    public static void main(String[] args) {
        romanToInt jopa = new romanToInt();
        System.out.println(jopa.romanToInteger("MCMXCIV"));
    }
    public int romanToInteger(String s) {
        LinkedHashMap<String, Integer> blyat = new LinkedHashMap<>();
        blyat.put("I", 1);
        blyat.put("V", 5);
        blyat.put("IV", 4);
        blyat.put("IX", 9);
        blyat.put("X", 10);
        blyat.put("L", 50);
        blyat.put("C", 100);
        blyat.put("XL", 40);
        blyat.put("XC", 90);
        blyat.put("D", 500);
        blyat.put("M", 1000);
        blyat.put("CD", 400);
        blyat.put("CM", 900);

        int result = 0;
        for (int i = 0; i < s.length();){
            if (i+1 < s.length() && blyat.containsKey("" + s.charAt(i) + s.charAt(i+1))){
                result += blyat.get("" + s.charAt(i) + s.charAt(i+1));
                i += 2;
                continue;
            }
            if (blyat.containsKey(s.charAt(i) + "")){
                result += blyat.get(s.charAt(i) + "");
                i++;
            }
        }
        return result;
    }
}
