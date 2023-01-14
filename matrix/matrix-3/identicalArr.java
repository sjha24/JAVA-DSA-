import java.util.Scanner;

public class identicalArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scn.nextInt();
        }
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = scn.nextInt();
        }

        for(int i = 0; i<n; i++){
            if(isIdentical(arr1, arr2, arr2[i])==false){
                System.out.println(false);
                return;
            }
            else {
                System.out.println(true);
            }
        }
    }

    public static boolean isIdentical(int arr1[],int arr2[], int target) {
        if (arr1.length != arr2.length)
            return false;
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(target+" ");
            if (arr1[i] !=target) {
                return false;
            }
        }
        return true;
    }
}
