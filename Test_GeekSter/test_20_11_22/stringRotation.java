import java.util.Scanner;

public class stringRotation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        String target = scn.next();
        System.out.println(str.contains(target));
    
        if(str.length() != target.length()){
            System.out.println("false");
        }else if((str+str).contains(target)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
