import java.util.Scanner;

// package countFrq;

public class c {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int arr[] = new int[size];
        for(int i  = 0;i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        countFrq(arr);
    }
    public static void countFrq(int arr[]){
        boolean traveld[] = new boolean[arr.length];
        for(int i = 0;i<arr.length; i++){
            if(traveld[i]==true){
                continue;
            }
            int count = 1;
            for(int j = i + 1; j<arr.length; j++){
                if(arr[j]==arr[i]){
                    traveld[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i]+" "+count);
        }
    }
}
