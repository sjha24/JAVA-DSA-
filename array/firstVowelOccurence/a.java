import java.util.Scanner;

// package firstVowelOccurence;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        char arr[] = new char[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scn.next().charAt(0);
        }
        for (int i = 0; i < N; i++) {
            if (arr[i] == 'a' || arr[i] == 'i' || arr[i] == 'e' || arr[i] == 'o' || arr[i] == 'u') {
                System.out.println(i);
                break;
            }
        }
    }
}
