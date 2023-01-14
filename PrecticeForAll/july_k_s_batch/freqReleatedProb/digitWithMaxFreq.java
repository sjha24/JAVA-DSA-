import java.util.ArrayList;
import java.util.Scanner;

public class digitWithMaxFreq {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        digitWithMaxFrequency(n);
    }
    public static void digitWithMaxFrequency(int n){
        ArrayList<Integer>arr = new ArrayList<>();
        while(n>0){
            int digit = n%10;
            arr.add(digit);
            n = n/10;
        }
        int count = 1,max = 0,maxEle = arr.get(0);
        for(int i = 1;i<arr.size();i++){
            if(arr.get(i)==arr.get(i-1)){
                count++;
            }
            if(count>max){
                max = count;
                maxEle = arr.get(i);
            }
        }
        System.out.println(maxEle);
    }
}
