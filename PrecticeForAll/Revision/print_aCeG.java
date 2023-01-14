// import java.util.Scanner;

public class print_aCeG {
    public static void main(String[] args) {
        boolean flag = true;
        for(int i = 0 ;i<25;i+=2){
            if(flag){
                char ch = (char)(i+'a');
                System.out.println((ch));
                flag = false;
            }else{
                char ch = (char)(i+'A');
                System.out.println((ch));
                flag = true;
            }
        }
    }
}