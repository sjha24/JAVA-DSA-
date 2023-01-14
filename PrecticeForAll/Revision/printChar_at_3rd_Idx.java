import java.util.Scanner;

public class printChar_at_3rd_Idx {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        if(str.length()>=4){
            System.out.println(str.charAt(3));
        }else{
            System.out.println("Small string");
        }
    }
}
