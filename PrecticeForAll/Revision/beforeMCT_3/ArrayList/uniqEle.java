import java.util.*;

public class uniqEle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int val = scn.nextInt();
            arr.add(val);
        }
        uniqNum(arr);
    }

    public static void uniqNum(ArrayList<Integer> arr) {
        LinkedHashSet<Integer> uniq = new LinkedHashSet<>();
        for (int i = 0; i < arr.size(); i++) {
            uniq.add(arr.get(i));
        }
        for(int val : uniq)
        System.out.print(val + " ");
    }
}