import java.util.Scanner;

// package addTwoNumRepersentByTwoArr;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr1[] = new int[n];
        for(int i = 0 ; i<n; i++){
            arr1[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int arr2[] = new int[m];
        for(int j = 0; j<arr2.length; j++){
            arr2[j] = scn.nextInt();
        }

    }
    public static String calSum(int arr1[], int n, int arr2[], int m){
        StringBuilder res = new StringBuilder();
        int p1 = arr1.length-1;
        int p2 = arr2.length-1;
        int carry = 0;
        while(p1>=0 || p2>=0 || carry > 0f){
            int d1 = (p1<0) ? 0 : arr1[p1];//?<--turnerry operater.
            int d2 = (p2<0) ? 0 : arr2[p2];
            int sum = d1 + d2 + carry;
            res.append(sum % 10);
            carry = sum  / 10;
            p1--;p2--;
        }
        //delete leading zero
        for(int i = res.length()-1; i>=0; i--){
            if(res.charAt(i)=='0'){
                res.deleteCharAt(i);
            }else break;
        }
        if(res.length()==0)return "0";
        return res.reverse().toString();
    }
}
