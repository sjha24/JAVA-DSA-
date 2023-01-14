import java.util.Scanner;

public class test1{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        char[] arr = new char[size];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.next().charAt(0);
        }
        System.out.print(print1st_Vowel_Accurance(arr));
    }
    public static int print1st_Vowel_Accurance(char[] arr){
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i] == 'a' || arr[i]=='e' || arr[i] == 'o' || arr[i]=='s'){
                return i;
            }
        }
        return -1;
    }
}