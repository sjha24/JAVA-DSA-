import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

// package basic;

public class reverseArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int size = scn.nextInt();
        for(int counter = 0; counter<size; counter++){
            int val = scn.nextInt();
            arr.add(val);
        }
        arr.add(10);
        arr.add(11);
        arr.add(12);
        arr.add(13);
        arr.add(14);
        arr.add(15);
        arr.add(16);
        arr.add(17);
        arr.add(18);
        for(int i = arr.size()-1; i>=0; i--){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        Collections.reverse(arr);
        for(int var : arr){
            System.out.print(var+" ");
        }
        arr.add(19);
        arr.add(20);
        arr.add(21);
        arr.add(22);
        arr.add(23);
        arr.add(24);
        arr.add(25);
        arr.add(26);
        System.out.println();
        for(int i = 0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        //foreach loop ---->
        for(int var : arr){
            System.out.print(var+" ");
        }
        System.out.println();
        arr.forEach((var)-> System.out.print(var+" "));
    }
}
