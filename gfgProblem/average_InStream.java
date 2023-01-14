import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class average_InStream {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        float res[] = streamAvg(arr, n);
        for(int i = 0;  i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
    public static float[] streamAvg(int arr[], int n){
        float res[] = new float[arr.length]; 
        // BigDecimal bigDecimal = new BigDecimal(Float.toString(res));
        float sum = 0;
        float ans = 0;
        float k = 1;
        for(int i = 0;i<arr.length; i++){
            sum = sum + arr[i];
            ans = sum/k;
            float deci = ans;
            float roundedFloat = Math.round(deci);
            res[i] = roundedFloat;
            k++;
        }
        // System.out.println("Rounded float: "+roundedFloat);
        return res;
    }
}
