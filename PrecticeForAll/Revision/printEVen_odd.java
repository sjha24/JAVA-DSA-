import java.util.Scanner;

public class printEVen_odd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        for(int i = 1; i<N ; i++){
            if(i%2==0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }
        }
    }
}
