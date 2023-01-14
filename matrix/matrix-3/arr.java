import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = scn.nextInt();
        }

        // for(int i =  0; i<a.length; i++){
        //     if(a[i]%2 !=0){
        //         System.out.print(i+" ");
        //     }
        // }

        for(int i = n-1; i>=0; i-=2){
            System.out.println(a[i]);
        }
    }
}
