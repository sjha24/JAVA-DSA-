import java.util.Scanner;

public class add_if_digit {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        char ch = scn.next().charAt(0);
        if(ch>='0' && ch<='9'){
           int N = ch-'0';
            System.out.print(N+100);
        }else{
            System.out.println("This is not a digit");
        }
    }
}
