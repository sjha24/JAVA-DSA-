import java.util.ArrayList;
import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer>arr = new ArrayList<>();
        int testCase = scn.nextInt();
        for(int i = 0; i<testCase; i++){
            int option = scn.nextInt();
            if(option == 1){
                arr.remove(arr.get(arr.size()-1));
                System.out.println("Invalid move");;
            }else if(option == 2){
                arr.remove(arr.size()-1);
                System.out.println(arr.size()-1);
            }else if(option == 3){
                int x = scn.nextInt();
                arr.add(x);
                System.out.println();
            }else if(option == 4){

            }else if(option == 5){

            }else{
                System.out.println(S);
            }
        }
    }
}
