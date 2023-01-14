// import java.lang.annotation.Target;
import java.util.Scanner;

// import javax.lang.model.element.Element;

// package repeatedMissingEle;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        for(int i = 1; i<=arr.length; i++){
            if(missingEle(arr,i) == true){
                System.out.println("missing ele-->"+i+" ");
            }
        }
        for(int i = 1; i<=arr.length; i++){
            if(repeatedEle(arr,i) == true){
                System.out.println(i);
            }
        }
    }
    public static boolean repeatedEle(int arr[], int target){
        int count = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        if(count>1)return true;
        else return false;
    }
    public static boolean missingEle(int arr[], int target){
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==target){
                return false;
            }
        }
        return true;
    }
}
