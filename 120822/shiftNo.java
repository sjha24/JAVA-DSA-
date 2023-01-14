import java.util.Scanner;

public class shiftNo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        shift_Num_to_left(num);
    }
    public static void shift_Num_to_left(int num){
        int shift = num%1000;
        num = num/1000;
        System.out.print(shift+""+num);
    }
}
