package rotate180Degree;

public class sec {
    public static void main(String[] args) {
        int top = 0, bottom = n - 1;
        while(top < bottom){
            for(int col = 0; col < n; col++){
                int temp = mat[top][col];
                mat[top][col] = mat[bottom][col];
                mat[bottom][col] = temp;
            }
            top++; bottom--;
        }
    }
    public static void reverseRows(int[][] mat, int n){
        for(int row = 0; row < n; row++){
            int left = 0, right = n - 1;
            
    
            while(left < right){
                int flag = mat[row][left];
                mat[row][left] = mat[row][right];
                mat[row][right] = flag;
                
                left++; right--;
            }
            
        }
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int[][] mat = new int[n][n]; 
        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                mat[row][col] = scn.nextInt();
            }
        }
        
        interchange(mat, n);
        reverseRows(mat, n);
        
        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                System.out.print(mat[row][col] + "  "); 
            }
            System.out.println();
        }
    }
}
