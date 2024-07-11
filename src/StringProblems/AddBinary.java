package StringProblems;

public class AddBinary {
    public static void main(String[] args) {
        AddBinary ab = new AddBinary();
        System.out.println(ab.addBinary1("11","1"));
        System.out.println(ab.addBinary2("11","1"));
        System.out.println(ab.addBinary1("1010", "1011"));
        System.out.println(ab.addBinary2("1010", "1011"));
    }
    public String addBinary1(String a, String b) {
        int a1 = a.length() - 1;
        int b1 = b.length() - 1;
        int carry = 0;
        StringBuilder res = new StringBuilder();
        while (a1 >= 0 || b1 >= 0){
            int sum = carry;
            if (a1 >= 0) sum += a.charAt(a1--) - '0';
            if (b1 >= 0) sum += b.charAt(b1--) - '0';
            if (sum > 1) carry = 1;
            else carry = 0;
            res.append(sum % 2);
        }
        if (carry != 0) res.append(carry);
        return res.reverse().toString();
    }

    public String addBinary2(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0) sum += a.charAt(i--) - '0';
            if(j >= 0) sum += b.charAt(j--) - '0';
            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
        }
        if(carry != 0) res.append(carry);
        return res.reverse().toString();
    }
}