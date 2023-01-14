import java.util.Scanner;

public class Steps_till_n_greater_than_0 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int step = 0;
        for(int i = N ; i>0; i++){
        if(i%2==0){
            N = N -1;
            step++;
        }else{
            N = N -3;
            step++;
            }
        }
    }
}
