import java.util.Scanner;

public class e {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int binary = scn.nextInt();
        int decimal = 0, power =1;
        while(binary>0){
            int digit = binary % 10;
            decimal = decimal + digit * power;
            power = power * 2;
            binary = binary / 10;
        }
        System.out.println(decimal);
    }
}
