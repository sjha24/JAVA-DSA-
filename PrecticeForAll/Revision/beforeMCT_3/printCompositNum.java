import java.util.ArrayList;
import java.util.Scanner;

public class printCompositNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int val = scn.nextInt();
            arr.add(val);
        }
        for (int i = 0; i < n; i++) {
            if(isCompositeNum(arr.get(i))==true)System.out.println(arr.get(i));
        }
    }
    public static boolean isCompositeNum(int num){
        if(num == 2)return false;
        for(int i = 2; i<=num-1; i++){
            if(num % i == 0)return true;
        }
        return false;
    }
}
