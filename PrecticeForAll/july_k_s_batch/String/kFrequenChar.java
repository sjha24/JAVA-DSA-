import java.util.Scanner;

public class kFrequenChar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int k = scn.nextInt();
        int freq[] = new int[26];
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch))
            freq[ch-'a']++;
        }
        String bucket[] = new String[str.length()+1];
        for(int i = 0; i<=str.length(); i++){
            bucket[i] = "";
        }
        for(char ch ='a' ; ch<='z'; ch++){
            int count = freq[ch -'a'];
            bucket[count]+=ch;
        }
        int count = 0;
        for(int i = str.length(); i>=0; i--){
            for(int j = 0; j<bucket[i].length(); j++){
                System.out.print(bucket[i].charAt(j)+" ");
                count++;
                if(count==k)return;
            }
        }
    }
}
