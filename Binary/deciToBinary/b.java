import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int decimal = scn.nextInt();
        if(decimal == 0){
            System.out.println(0);
            return;
        }
        StringBuilder binary = new StringBuilder("");
        while(decimal>0){
            binary.append(decimal%2);
            decimal = decimal /2;
        }
        binary = binary.reverse();
        System.out.println(binary);
    }
}
