import java.util.Scanner;

public class stringForMation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        StringBuilder sb = new StringBuilder(s);
        int t = scn.nextInt();
        while(t-->0){
            int Q = scn.nextInt();
            if(Q==1){
                sb.reverse();
            }else if(Q==2){
                int F = scn.nextInt();
                char c = scn.next().charAt(0);
                if(F==1){
                    sb.insert(0, c);
                }else if (F==2){
                    sb.append(c);
                }
            }
        }
        System.out.println(sb.toString());
    }
}
