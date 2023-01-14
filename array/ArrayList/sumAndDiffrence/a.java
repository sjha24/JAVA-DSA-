import java.util.ArrayList;
import java.util.Scanner;

public class a{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer>arr= new ArrayList<>();
        int count = scn.nextInt();
        for(int i = 0; i<count; i++){
            int val = scn.nextInt();
            arr.add(val);
        }
        int sum = 0;
        for(int i = 0; i<arr.size(); i++){
            sum = sum+(arr.get(i));
        }
        System.out.println(sum);
        System.out.println("<----again Add Counter");   
        for(int i = 0; i<count; i++){
            int val = scn.nextInt();
            arr.add(val);
        }
        int subtraction = 0;
        int addition = 0;
        for(int i = 0;i<arr.size(); i++){
            addition = addition + arr.get(i);
        }
        System.out.println(addition);
        subtraction = addition - sum;
        System.out.println(subtraction);
    }          
}