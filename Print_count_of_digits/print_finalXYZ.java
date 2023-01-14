import java.util.Scanner;

public class print_finalXYZ {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int countOfDigit = scn.nextInt();
        int result = 0;
        for(int i = 0; i<countOfDigit;i++){
            int digit = scn.nextInt();
            result = result * 10 + digit;
        }
        System.out.print(result);

    }
}
