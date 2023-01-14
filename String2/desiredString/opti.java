import java.util.Scanner;

public class opti {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int L = leftMost(str);
        int R = rightMost(str);
        int count = desireddStringCounter(str);
        if(count<=1){
            System.out.println(-1);
        }else{
            System.out.println(count);
            System.out.println(R-L+1);//<- Longest length
            System.out.println(str.substring(L, R+1));
        }
        scn.close();
    }
    public static int desireddStringCounter(String str){
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)=='A')count++;
        }
        int coun = (count*(count-1)/2);
        return coun;
      
    }
    public static int leftMost(String str){
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)=='A')return i;
        }
        return -1;
    }
    public static int rightMost(String str){
        for(int i = str.length()-1; i>=0; i--){
            if(str.charAt(i)=='A')return i;
        }
        return -1;
    }
}
