import java.util.Scanner;

public class d {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int binary = scn.nextInt();
        int power = 1, decimal = 0;
        while(binary>0){
            int bit = binary  %  10;
            decimal = decimal + bit *power;
            power = power * 2;
            binary = binary/10; 
        }
        System.out.println(decimal);
    }
}
