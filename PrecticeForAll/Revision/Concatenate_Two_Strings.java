import java.util.Scanner;

public class Concatenate_Two_Strings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str_F = scn.next();
        String str_S = scn.next();
        if(str_F.length()>str_S.length()){
            System.out.print(str_S+str_F+str_S);
        }else{
            System.out.print(str_F+str_S+str_F);
        }
    }
}
