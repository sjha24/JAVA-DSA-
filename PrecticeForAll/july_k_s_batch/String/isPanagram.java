import java.util.Scanner;

public class isPanagram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        boolean freq[] = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                freq[ch - 'a'] = true;
            }else if(Character.isUpperCase(ch)){
                freq[ch-'A'] = true;
            }

        }
        for(int i = 0; i<freq.length; i++){
            if(freq[i] == false){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

}