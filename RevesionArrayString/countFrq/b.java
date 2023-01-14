import java.util.Scanner;

// import javax.script.ScriptContext;

// package countFrq;

public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int arr[] = new int[num];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        countFrq(arr);
    }
    public static void countFrq(int arr[]){
        boolean visited[] = new boolean[arr.length];
        for(int i = 0;i<arr.length; i++){
            if(visited[i]==true){
                continue;
            }
            int count = 1;
            for(int j = i+1 ; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i]+" "+count);
        }
    }
}
