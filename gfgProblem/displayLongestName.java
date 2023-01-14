import java.util.Scanner;

public class displayLongestName {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        String names[] = new String[n];
        for(int i = 0; i<n; i++){
            names[i] = scn.next();
        }
        int max = 0;
        for(int i = 1; i<n; i++){
            if(names[i].length() > names[max].length())
            max = i;
        }
        System.out.println(names[max]);
    }

}
