import java.util.Scanner;

public class isEquall {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1  = scn.nextLine();
        String str2  = scn.nextLine();
        //System.out.println(str1 == str2);<--its compare adress(reference value which is stored in Stack)

        System.out.println(str1.equals(str2));//<--its compare data(acctual object which is stored in heap)
    }
}
