// import java.util.Scanner;

public class Print_a_B {
    public static void main(String[] args) {
        for(int i = 0 ; i<26; i++){
            if(i%2==0){
                System.out.println((char)((int)('a'+i)));
            }else{
                System.out.println((char)((int)('A'+i)));
            }
        }
    }
}
