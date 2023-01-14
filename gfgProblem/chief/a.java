import java.util.Scanner;

// package chief;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        int A = scn.nextInt();
        while(t>0){
            int B = scn.nextInt();
            int A1 = scn.nextInt();
            int B1 = scn.nextInt();
            int A2 = scn.nextInt();
            int B2 = scn.nextInt();
            if(A == A1 && B == B1 || A == B1 && B == A1){
                System.out.println("1");
            }else if(A == A2 && B == B2 || A == B2 && B == A2){
                System.out.println("2");
            }else{
                System.out.println(0);
            }
            t--;
        }
    }
}
