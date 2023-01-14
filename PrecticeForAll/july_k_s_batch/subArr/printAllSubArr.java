import java.util.Scanner;

public class printAllSubArr{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        for(int left = 0; left<n; left++){
            for(int right = left; right<n; right++){
                for(int st = left; st<=right; st++){
                    System.out.print(arr[st]+" ");
                }
                System.out.println();
            }
        }
    }
}