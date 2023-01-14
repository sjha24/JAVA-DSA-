import java.util.Scanner;

public class functionOverLoading{
    public static void main(String[] args) {
        functionOverLoading obj = new functionOverLoading();
        System.out.println(obj.sum(2, 5));
        System.out.println(obj.sum("saurav", 24));
        System.out.println(obj.sum('a', 'b'));
        System.out.println(obj.sum(4321454, 5244455, 335352235));
        System.out.println(obj.sum("saurav", null));
    }
    public int sum(int a , int b){
        System.out.println("Two Integer Input");
        return a+b;
    }
    public long sum(long a, long b, long c){
        System.out.println("Three long value");
        return a+b+c;
    }
    public String sum(String a, String b){
        return a+b;
    }
    public String sum(String a , long b){
        System.out.println("String concatenation");
        return a+b;
    }
    public float sum(float a, float b){
        System.out.println("Two float value");
        return a+b;
    }
}