import java.util.Scanner;

// package countPalindromeRow;

public class f {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int mat[][] = new int[rows][cols];
        for(int row = 0; row<rows; row++){
            for(int col = 0; col<cols; col++){
                mat[row][col] = scn.nextInt();
            }
        }
        int count = 0;
        for(int row = 0; row<rows; row++){
            if(isPalindrome(mat, row)==true){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isPalindrome(int mat[][], int row){
        int left = 0, right = mat[0].length-1;
        while(left<right){
            if(mat[row][left] != mat[row][right])return false;
            left++;right--;
        }
        return true;
    }
}
