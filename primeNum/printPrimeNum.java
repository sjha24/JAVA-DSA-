import java.util.Scanner;

public class printPrimeNum {
    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            
            boolean[] primes = new boolean[n + 1];
            for(int idx = 2; idx <=n; idx++){
               primes[idx] = true; // Assuming all numbers are prime initially    
            }
            
            for(int idx = 2; idx <= n; idx++){
                if(primes[idx] == true){
                    System.out.print(idx + " ");
                    
                    for(int multiples = 2 * idx; multiples <= n; multiples = multiples + idx){
                        primes[multiples] = false;
                    }
                }
            }
    
        }
    }