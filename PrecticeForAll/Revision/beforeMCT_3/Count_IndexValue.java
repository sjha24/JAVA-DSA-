import java.util.ArrayList;
import java.util.Scanner;

public class Count_IndexValue {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int val = scn.nextInt();
            arr.add(val);
        }
        int cnt = 0;
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i)==i)cnt++;
        }
        System.out.println(cnt);
    }
}
