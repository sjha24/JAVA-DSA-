import java.util.Scanner;

public class opti {
    public static int leftMostString(String str){
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)=='A')return i;
        }
        return -1;
    }
    public static int rightMostString(String str){
        for(int i = str.length(); i>=0; i--){
            if(str.charAt(i)=='A')return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int count = 0;
        for(int i =  0; i<str.length(); i++){
            if(str.charAt(i)=='A'){
                count++;
            }
        }
        if(count<=1){
            System.out.println(-1);
        }else{
            System.out.println(count*(count-1)/2);
            int L = leftMostString(str);
            int r = rightMostString(str);
            System.out.println(L-r+1);
            System.out.println(str.substring(r,L+1));
        }
    }
}
