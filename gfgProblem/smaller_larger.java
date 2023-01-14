import java.util.Scanner;

public class smaller_larger {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int res[] = graterAndLess(arr,x);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] graterAndLess(int arr[],int x) {
        int res[] = new int[2];
        int minCount = 0, greaterCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                greaterCount++;
            } else if (arr[i] <x) {
                minCount++;
            }else if(arr[i]==x){
                minCount++;
                greaterCount++;
            }
        }
        res[0] = minCount;
        res[1] = greaterCount;
        return res;
    }
}
