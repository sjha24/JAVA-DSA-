import java.util.Scanner;

public class test1 {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        int n = scn.nextInt();
        for(int i = 0; i<n;i++){
            for(int j = 0 ; j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
