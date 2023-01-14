import java.util.Scanner;

public class shiftZero {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans[][] = new int[n][];
        while(n-->0){
            int count = 0;
            int size1 = scn.nextInt();
            count++;
            for(int i = 0; i<size1; i++){
                ans[count][i] = scn.nextInt();
            }
        }
    }
}
