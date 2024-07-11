package StringProblems;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static java.util.Map.entry;

public class IntegerToRoman {
//    Map<Integer, String> blyat = Map.ofEntries(entry(1, "I"), entry(4, "IV"), entry(5, "V"), entry(9, "IX"), entry(10, "X"),
//                                               entry(40, "XL"), entry(50, "L"), entry(90, "XC"), entry(100, "C"),
//                                               entry(400, "CD"), entry(500, "D"), entry(900, "CM"), entry(1000, "M"));
Map<Integer, String> blyat = new LinkedHashMap<>();
    public String intToRoman(int num) {
        blyat.put(1, "I");
        blyat.put(4, "IV");
        blyat.put(5, "V");
        blyat.put(9, "IX");
        blyat.put(10, "X");
        blyat.put(40, "XL");
        blyat.put(50, "L");
        blyat.put(90, "XC");
        blyat.put(100, "C");
        blyat.put(400, "CD");
        blyat.put(500, "D");
        blyat.put(900, "CM");
        blyat.put(1000, "M");
        StringBuilder answer = new StringBuilder();
        List<Integer> keysList = blyat.keySet().stream().toList();

        int i = keysList.size() - 1;
        while(num > 0) {
                    int biggestNum = keysList.get(i);
                    if (num >= biggestNum){
                        num -= biggestNum;
                        answer.append(blyat.get(biggestNum));
                    } else {
                        i--;
                }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        IntegerToRoman i = new IntegerToRoman();
        System.out.println(i.intToRoman(1994));
    }
}
