import java.io.*;
import java.util.*;

public class subsequenceOfString {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        int n = str.length();
        int count = (int) Math.pow(2, n);

        for (int decimal = count - 1; decimal > 0; decimal--) {
            String res = "";
            int temp = decimal;
            for (int bit = n - 1; bit >= 0; bit--) {
                if (temp % 2 == 1)
                    res = str.charAt(bit) + res;
                temp = temp / 2;
            }
            System.out.print(res + " ");
        }

    }
}