import java.util.Scanner;

public class powerOfStr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int count = 1, max = 1;
        for(int i = 1; i<str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            }else{
                count = 1;
            }
            if(max<count)
            max = count;
        }
        System.out.println(max);
    }
}
