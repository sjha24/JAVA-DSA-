import java.util.Scanner;

public class countWord {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(str);
        int count = 0;
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i) != ' ' && (i == 0 || str.charAt(i-1) ==' ' )){
                count++;
            }
        }
        System.out.println(count);
    }
}
