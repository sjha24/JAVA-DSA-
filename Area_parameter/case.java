import java.util.Scanner;
public class case{
    public static void main(String[] args){
        Scanner scn = new scanner(System.in);
        int length = scn.nextInt();
        int breath = scn.nextInt();
        System.out.println(length*breath);
        System.out.println(2*(length+breath));
    }
}