import java.util.Scanner;

// package addBinaryString;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String num1 = scn.nextLine();
        String num2 = scn.nextLine();
        System.out.println(addBinary(num1, num2));
    }
    public static String addBinary(String num1, String num2){
        StringBuilder res = new StringBuilder();
        int p1 = num1.length()-1;
        int p2 = num2.length()-1;
        int carry = 0;
        while(p1>=0 || p2>=0 || carry >0){
            int d1 = (p1<0)? 0 : num1.charAt(p1)-'0';
            int d2 = (p2<0)?0 : num2.charAt(p2)-'0';
            int sum = d1 + d2 + carry;
            res.append(sum%10);
            carry = sum /10;
            p1--;p2--;
        }
        for(int i = res.length()-1; i>=0; i--){
            if(res.charAt(i)=='0'){
                res.deleteCharAt(i);
            }else break;
        }
        if(res.length() == 0)return "0";
        return res.reverse().toString();
    }
}
