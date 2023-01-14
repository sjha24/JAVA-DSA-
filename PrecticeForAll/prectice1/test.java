import java.util.Scanner;

public class test {

    public static int Large(int A,int B,int C){
        if (A>B && A<C || A>C && A< B){
                    return A;
                }else if(B>A && B<C || B>C && B<A){
                     return B;
                }else {
                     return C;
            }
        }

    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B = scn.nextInt();
        int C = scn.nextInt();

        System.out.print(Large(A, B, C));
    }
}
