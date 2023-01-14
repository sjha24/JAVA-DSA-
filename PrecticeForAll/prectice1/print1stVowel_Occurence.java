import java.util.Scanner;

public class print1stVowel_Occurence {
    public static Scanner scn  = new Scanner(System.in);
    public static void main(String[] args) {
        int size = scn.nextInt();
        char[]arr = new char[size];
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = scn.next().charAt(0);
        }
        System.out.print(isVowel(arr));
    }
    public static int isVowel(char[] arr){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'O' || arr[i] == 'u'){
                return i;
            }
        }
        return -1;
    }
}
