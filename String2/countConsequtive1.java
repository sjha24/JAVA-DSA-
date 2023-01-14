import java.util.Scanner;

public class countConsequtive1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String num = scn.next();
        int count = 0, max = 0;
        for(int i = 0; i<num.length(); i++){
            if(num.charAt(i)=='1')count++;
            else count = 0;
        }
        if(max<count)max = count;
        System.out.println(max);
    }
}
