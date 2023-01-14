import java.util.Scanner;

public class searchChar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);

        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n; i++){
            arr[i] = scn.nextInt();
        }
        for(char i = 'a'; i<n+'a'; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
