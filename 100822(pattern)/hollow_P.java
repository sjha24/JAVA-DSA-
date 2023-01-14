import java.util.Scanner;

public class hollow_P {
    public static void main(String[] args) {
        
    
    Scanner scan = new Scanner(System.in);
        int colum = scan.nextInt();
        int rows = scan.nextInt();
        for (int row = 1; row <= rows; row++)
        {
            for (int col = 1; col <= colum; col++)
            {
                if (row == 1 || row == rows || col == 1 || col == colum)           
                    System.out.print("*");           
                else
                    System.out.print(" ");           
            }
            System.out.println();
        }
    }  
      
}
