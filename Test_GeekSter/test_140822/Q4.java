import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String word = scn.next();
        String space = " ";
        for(int i = 0; i<word.length();i++){
            if(i==0){
                System.out.println(word.charAt(0));
            }else{
                System.out.println(space+word.charAt(i));

                space += " ";
            }
        }
    }
}
