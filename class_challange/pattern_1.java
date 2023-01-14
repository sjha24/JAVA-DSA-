import java.util.Scanner;

public class pattern_1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        printSpace(N);
        printStar(N);
        // print_pattern(N);
    }
    public static void printSpace(int N){
        for(int i = N;i>0;i--){
            for(int j = i;j>0;j--){
                System.out.print("_");
                
            }
            System.out.println();
        }
    }
    public static void printStar(int N){
        // printSpace(N);
        for(int i = 0;i<N;i++){
            for(int j = 0; j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
