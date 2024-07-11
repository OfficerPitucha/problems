package StringProblems;

import java.util.*;

public class PhoneLetterCombinations {
    List<String> answer = new ArrayList<>();
    char[][] letters = new char[][]{{}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'},
            {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'},
            {'w', 'x', 'y', 'z'}};
    Map<Character, List<Character>> letter = Map.of('2', Arrays.asList('a', 'b', 'c'), '3',
                                                    Arrays.asList('d', 'e', 'f'), '4',
                                                    Arrays.asList('g', 'h', 'i'), '5',
                                                    Arrays.asList('j', 'k', 'l'), '6',
                                                    Arrays.asList('m', 'n', 'o'), '7',
                                                    Arrays.asList('p', 'q', 'r', 's'), '8',
                                                    Arrays.asList('t', 'u', 'v'), '9',
                                                    Arrays.asList('w', 'x', 'y', 'z'));

    Map<Character, String> digitsToLetters = Map.of('2', "abc", '3', "def", '4', "ghi", '5', "jkl",
                                                    '6', "mno", '7', "pqrs", '8', "tuv", '9',
                                                    "wxyz");

    public List<String> letterCombinations(String digits) {
        answer = new ArrayList<>();
        int len = digits.length();
        if (len > 0) {
            for (char c1 : letters[Character.getNumericValue(digits.charAt(0))]) {
                if (len > 1) {
                    for (char c2 : letters[Character.getNumericValue(digits.charAt(1))]) {
                        if (len > 2) {
                            for (char c3 : letters[Character.getNumericValue(digits.charAt(2))]) {
                                if (len > 3) {
                                    for (char c4 : letters[Character.getNumericValue(
                                            digits.charAt(3))]) {
                                        answer.add("" + c1 + c2 + c3 + c4);
                                    }
                                } else {
                                    answer.add("" + c1 + c2 + c3);
                                }
                            }
                        } else {
                            answer.add("" + c1 + c2);
                        }
                    }
                } else {
                    answer.add("" + c1);
                }
            }
        }
        return answer;
    }

    public List<String> letterCombinationsMap(String digits) {
        answer = new ArrayList<>();
        int len = digits.length();
        if (len > 0) {
            for (char c1 : letter.get(digits.charAt(0))) {
                if (len > 1) {
                    for (char c2 : letter.get(digits.charAt(1))) {
                        if (len > 2) {
                            for (char c3 : letter.get(digits.charAt(2))) {
                                if (len > 3) {
                                    for (char c4 : letter.get(digits.charAt(3))) {
                                        answer.add("" + c1 + c2 + c3 + c4);
                                    }
                                } else {
                                    answer.add("" + c1 + c2 + c3);
                                }
                            }
                        } else {
                            answer.add("" + c1 + c2);
                        }
                    }
                } else {
                    answer.add("" + c1);
                }
            }
        }
        return answer;
    }

    public List<String> letterCombinationsSolution(String digits) {
        List<String> res = new ArrayList<>();

        if (digits == null || digits.isEmpty()) {
            return res;
        }

        Map<Character, String> digitToLetters = new HashMap<>();
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");

        backtrack(digits, 0, new StringBuilder(), res, digitToLetters);

        return res;
    }

    private void backtrack(String digits, int idx, StringBuilder comb, List<String> res, Map<Character, String> digitToLetters) {
        if (idx == digits.length()) {
            res.add(comb.toString());
            return;
        }

        String letters = digitToLetters.get(digits.charAt(idx));
        for (char letter : letters.toCharArray()) {
            comb.append(letter);
            backtrack(digits, idx + 1, comb, res, digitToLetters);
            comb.deleteCharAt(comb.length() - 1);
        }
    }


    public static void main(String[] args) {
        PhoneLetterCombinations plc = new PhoneLetterCombinations();
        System.out.println(plc.letterCombinationsSolution("23"));
    }
}
