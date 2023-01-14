import java.util.ArrayList;
import java.util.Scanner;

public class firstNonMatchingArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int val = scn.nextInt();
            arr1.add(val);
        }
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int value = scn.nextInt();
            arr2.add(value);
        }
        System.out.println(firstNonMatchingIdx(arr1, arr2));
    }
    public static int firstNonMatchingIdx(ArrayList<Integer>arr1,ArrayList<Integer>arr2){
        for(int i = arr1.size()-1; i>=0; i--){
            if(arr1.get(i)!=arr2.get(i))return i;
        }
        return -1;
    }
}
