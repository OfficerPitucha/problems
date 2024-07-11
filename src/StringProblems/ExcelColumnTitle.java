package StringProblems;

public class ExcelColumnTitle {
    public static void main(String[] args) {
        System.out.println((char) ('A' + 25 - 1));
        ExcelColumnTitle a = new ExcelColumnTitle();
        System.out.println(a.convertToTitle(701));
    }
    public String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();
        while (columnNumber-- > 0) {
            res.append((char)('A' + columnNumber % 26));
            columnNumber /= 26;
        }
        return res.reverse().toString();
    }
}
