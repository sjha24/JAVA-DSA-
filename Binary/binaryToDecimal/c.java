import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String binary = scn.next();
        int power = 1,decimal = 0;
        for(int i = binary.length()-1; i>=0; i--){
            if(binary.charAt(i)=='1'){
                decimal = decimal+power;
            }
            power = power *2;
        }
        System.out.println(decimal);
    }
}
