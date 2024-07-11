package StringProblems;

import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        Map<Character, Integer> alphabetToNumber = new HashMap<>();
        "ABCDEFGHIJKLMNOPQRSTUVWXYZ".chars()
                .forEach(ch -> alphabetToNumber.put((char) ch, ch - 'A' + 1));
        return columnTitle.length() == 1 ? alphabetToNumber.get(columnTitle.charAt(0)) : alphabetToNumber.get(columnTitle.charAt(0)) * 26 + alphabetToNumber.get(columnTitle.charAt(1));
    }
}
