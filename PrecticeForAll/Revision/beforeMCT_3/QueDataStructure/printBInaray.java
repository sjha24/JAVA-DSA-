import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

// package QueDataStructure;

public class printBInaray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String>res = printBinary(n);
        for(int i = 0;i<res.size(); i++){
            System.out.println(res.get(i));
        }
    }
    public static ArrayList<String> printBinary(int n){
        ArrayList<String>ans = new ArrayList<>();
        Queue<String>q = new ArrayDeque<>();
        q.add("1");
        while(n-->0){
            String num = q.remove();
            ans.add(num);
            q.add(num+"0");
            q.add(num+"1");
        }
        return ans;
    }
}
