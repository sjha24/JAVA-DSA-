import java.util.Scanner;

public class countFrqArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        countFrequency(arr);
    }
    public static void countFrequency(int arr[]){
        boolean visited[] = new boolean[arr.length];
        for(int i = 0; i<arr.length; i++){
            if(visited[i] == true)continue;
            int count = 1;
            for(int j = i + 1 ; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i]+" "+count);
        }
    }
}
