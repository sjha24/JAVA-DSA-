package basic;
import java.util.ArrayList;
import java.util.Scanner;

public class syntax{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        // System.out.println(arr);
        // arr.add(10);
        // arr.add(20);
        // System.out.println(arr);
        // System.out.println(arr.size());//<-length
        // int size = scn.nextInt();

        // for(int counter = 0; counter<size; counter++){
        //     int var = scn.nextInt();
        //     arr.add(var);
        //     System.out.println(arr);
        // }

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        for(int i = 0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        for(int i = arr.size()-1; i>=0; i--){
            System.out.print(arr.get(i)+" ");
        }
    }
}