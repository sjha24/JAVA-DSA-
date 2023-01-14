import java.util.Scanner;

public class firstUniqNum{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        boolean freq[] = new boolean[10];
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            freq[str.charAt(i)-'0']= true;
        }
        for(int i = 0; i<str.length(); i++){
            if(freq[i]==true)count++;
        }
        System.out.println(count);
    }
}