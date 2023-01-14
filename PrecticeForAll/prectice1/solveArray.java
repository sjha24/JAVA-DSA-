import java.util.Scanner;

public class solveArray {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int size = scn.nextInt();
        int[]number = new int[size];
        for(int i = 0; i<number.length; i++){
            number[i] = scn.nextInt();
        }
        int[]index = new int[size];
        for(int i = 0; i<index.length;i++){
            index[i] = scn.nextInt();
        }
        //print---
        int res[] = printArray(number,index);
        for(int i = 0; i<size;i++){
            System.out.print(res[i]+" ");
        }

    }
    public static int[] printArray(int[]number, int[] index){
        int[]res = new int[number.length];
        for(int i = 0; i<number.length;i++){
            res[index[i]] = number[i];
        }
        return res;
    }
}
