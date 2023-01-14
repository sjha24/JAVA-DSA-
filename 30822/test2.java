import java.util.Scanner;

public class test2 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i <26; i++) {
            if(i%2==0){
                char ch = (char)('a'+i);
                System.out.println(ch);
            }else{
                char ch2 = (char)('A'+i);
                System.out.println(ch2);
            }
        }
    }
}
