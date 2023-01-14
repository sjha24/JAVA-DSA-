import java.util.Scanner;

public class print_xyz {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 0 ; i<n;i++){
            int num = scn.nextInt();
            System.out.print(num);
        }
    }
}
