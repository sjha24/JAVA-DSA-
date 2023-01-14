import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class printCommonEle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
       ArrayList<String>arr1 = new ArrayList<>();
        for(int i = 0; i<n; i++){
            String str = scn.next();
            arr1.add(str);
        }
        int m = scn.nextInt();
        ArrayList<String>arr2 = new ArrayList<>();
        for(int i = 0;i<m; i++){
            String str2 = scn.next();
            arr2.add(str2);
        }

            System.out.print(arr1.stream().filter(arr2::contains).collect(Collectors.toList()));
        
    }
}