import java.util.Scanner;

public class firstVowelOccurence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            char ch = scn.next().charAt(0);
            arr[i] = ch;
        }
        for(int i = 0; i<n; i++){
            if(arr[i]== 'a' || arr[i]=='e' || arr[i]=='i'||arr[i]=='o' || arr[i]=='u'
            || arr[i]== 'A' || arr[i]=='E' || arr[i]=='I'||arr[i]=='O' || arr[i]=='U'){
                System.out.println(i);
                return;
            }
        }
    }
}
