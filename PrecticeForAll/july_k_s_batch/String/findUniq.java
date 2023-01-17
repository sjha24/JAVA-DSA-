import java.util.Scanner;

public class findUniq {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        boolean freq[] = new boolean[10];
        
        for(int i = 0; i<str.length(); i++){
            int num = str.charAt(i)-'0';
            freq[num] = true;
        }
        int count = 0;
        for(int i = 0; i<freq.length; i++){
            if(freq[i]==true)count++;
        }
        System.out.println(count);
    }
}
