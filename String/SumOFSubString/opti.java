import java.util.Scanner;

public class opti {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        for(int i = 0; i<str.length(); i++){

        }
    }
    public static int StringToIntegere(String str){
        int sum = 0, multi = 1, overAllSum = 0;
        for(int last = str.length(); last >=0;last-- ){
            sum = sum + multi*10;
        }
    }
}
