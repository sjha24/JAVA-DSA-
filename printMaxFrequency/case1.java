import java.util.Scanner;

public class case1{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[]arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.print(maxFrequency(arr));
    }
    public static int maxFrequency(int[]arr){
        int count = 1, max = 0, maxEle = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==arr[i-1]){
                count++;
                if(count>max){
                    max = count;
                    maxEle = arr[i];
                }
            }else{
                count = 1;
            }
        }
        return maxEle;
    }
}