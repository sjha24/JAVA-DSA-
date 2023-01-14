import java.util.Scanner;

public class maxOccuring{
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine()
        String target = scn.nextLine();
        System.out.println(getMaxOccurring(str,target));
    }

    public static String getMaxOccurring(String str, String target){
        int freq[] = new int[26];
        int targetFreq[] = new int[26];
        for (int i = 0; i <str.length(); i++){
            freq[str.charAt(i)-'a']++;
        }
        for(int i = 0;i<target.length();i++){
            targetFreq[target.charAt(i)-'a']++;
        }

        int max = Integer.MIN_VALUE;
        char result = ' ';
        for (int i = 0; i <str.length(); i++) {
            if (max < freq[str.charAt(i)-'a']) {
                max = freq[str.charAt(i)-'a'];
                result = str.charAt(i);
            }
        }
        int max2 = Integer.MIN_VALUE;
        char res = ' ';
        for (int i = 0; i <target.length(); i++) {
            if (max2 < targetFreq[target.charAt(i)-'a']) {
                max2 = targetFreq[target.charAt(i)-'a'];
                res = target.charAt(i);
            }
        }
        if(result == res)return "Yes";
        else return "No";
        k
    }
}