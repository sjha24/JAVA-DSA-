import java.util.Scanner;

public class print_aplhabet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        for(char alpha = 'a' ; alpha<=ch; alpha++){
            System.out.print(alpha+" ");
        }
    }
}
