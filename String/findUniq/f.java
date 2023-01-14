import java.util.Scanner;

// package findUniq;

public class f {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        boolean frq[] = new boolean[10];
        for(int i = 0; i<str.length(); i++){
            frq[str.charAt(i)-'0'] = true;
        }
        int count = 0;
        for(int i = 0; i<10; i++){
            if(frq[i]==true)count++;
        }
        System.out.println(count);
    }
}
