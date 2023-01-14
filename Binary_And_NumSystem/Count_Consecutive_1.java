import java.util.Scanner;

public class Count_Consecutive_1{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int count = 0, max = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)=='1')count++;
            else count = 0;
        }
        if(count>max)
        count = max;
        System.out.println(max);
    }
}