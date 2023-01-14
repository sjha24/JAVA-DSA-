import java.util.Scanner;

public class printAlterNate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i<N;i++){
            arr[i] = scn.nextInt();
        }
        for(int i = 0; i<N; i+=2){
            System.out.println(arr[i]);
        }
    }
}
