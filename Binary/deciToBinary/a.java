import java.util.Scanner;

// package deciToBinary;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        DeciToBinary(num);
    }
    public static void DeciToBinary(int num){
        int binary[] = new int[num];
        int i = 0;
        while(num>0){
            binary[i] = num%2;
            num = num/2;
            i++;
        }
        for(int j = i - 1;j>=0; j--){
            System.out.println(binary[j]);
        }
    }
}
