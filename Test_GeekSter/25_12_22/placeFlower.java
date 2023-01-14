import java.util.Scanner;

public class placeFlower {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        System.out.println(Flowers(arr, k));
    }
    public static boolean Flowers(int[]arr, int k) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        int count = 1;  // count the number of continous empty plots.
        int PlantedPlot = 0;    // the total number of empty plots that coule be planted.
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            } else {
                PlantedPlot += (count - 1) / 2;
                count = 0;
            }
        }
        
        if (count != 0) {
            PlantedPlot += count / 2;
        }
        
        return PlantedPlot >= k;
    }
}