// package K_Frequent_Characters;

import java.util.Scanner;

public class f {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int k = scn.nextInt();
        
        int[] freq = new int[26];
        for(int idx = 0; idx < str.length(); idx++){
            char ch = str.charAt(idx);
            
            if(Character.isLowerCase(ch) == true){
                freq[ch - 'a']++;
            }
        }
        
        String[] buckets = new String[str.length() + 1];
        for(int idx = 0; idx <= str.length(); idx++){
            buckets[idx] = "";
        }
        
        for(char ch = 'a'; ch <= 'z'; ch++){
            int count = freq[ch - 'a'];
            buckets[count] += ch;
        }
        
        int count = 0;
        for(int i = str.length(); i >= 0; i--){
            for(int j = 0; j < buckets[i].length(); j++){
                System.out.print(buckets[i].charAt(j) + " ");
                count++;
                
                if(count == k) return;
            }
        }
    }
}
