import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        System.out.println(sumeOfLastXele(arr, x));
        System.out.println(sumeOfLastXelement(arr, x));
    }
    public static int sumeOfLastXele(int arr[], int x){
        int lastEle = arr.length - x;
        int sum = 0;
        for(int i = lastEle; i<arr.length; i++ ){
            sum = sum+arr[i];
        }
        return sum;
    }
    public static int sumeOfLastXelement(int arr[], int x){
        int i = arr.length-1;
        int sum = 0;
        while(x>0){
            sum += arr[i];//sum = sum+arr[i];
            i--;
            x--;
        }
        return sum;
    }
}
