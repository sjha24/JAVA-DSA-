import java.util.ArrayList;
import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer>arr = new ArrayList<>();
        int t = scn.nextInt();
        for(int i = 0; i<t; i++){
            int val = scn.nextInt();
            arr.add(val);
        }
        int left = 0, right = arr.size()-1;

       //reversing the sub-array from left index to right index.
       while (left < right) { 
        //swapping values at index stored at left and right index.
        int temp = arr.get(left); 
        arr.set(left, arr.get(right)); 
        arr.set(right, temp);
        
        //updating values of left and right index.
        left+=1; 
        right-=1;  
}
