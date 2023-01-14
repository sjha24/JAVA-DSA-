import java.util.Scanner;

public class minDistance {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char a = scn.nextLine().charAt(0);
        char b = scn.nextLine().charAt(0);
        int minDis = Integer.MAX_VALUE;
        for(int i =0; i<str.length(); i++){
            for(int j = 0; j<str.length(); j++){
                if(str.charAt(i)==a && str.charAt(j)==b){
                    minDis = Math.min(minDis,(j-i-1));
                }
            }
        }
         System.out.println(minDis);
    }
}
