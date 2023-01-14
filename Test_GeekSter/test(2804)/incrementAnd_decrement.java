import java.util.Scanner;

// import javax.script.ScriptException;

public class incrementAnd_decrement{
    public static Scanner Scn = new Scanner(System.in);
    public static void main(String[] args) {
        int size = Scn.nextInt();
        int[] arr = new int[size];
        input(arr);
        intcrementORDecrement(arr);
        printMax(arr);
    }

    public static void input(int[] arr){
        for(int i = 0; i<arr.length; i++){
            arr[i] = Scn.nextInt();
        }
    }
    public static void intcrementORDecrement(int[] arr){
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i]<5){
                arr[i]++;
            }else if(arr[i]>5){
                arr[i]--;
            }
        }
    }
    public static void printMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                 max = arr[i];
            }
        }
        System.out.print(max);
    }


}