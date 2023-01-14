import java.util.Scanner;

// package locateTargetStr;

public class f {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String Tar = scn.nextLine();
        for(int i = 0; i<=str.length()-Tar.length(); i++){
            String window =  str.substring(i, i+Tar.length());
            if(window.equals(Tar)){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
