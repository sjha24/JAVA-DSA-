
// import java.lang.invoke.ClassSpecializer.Factory;
import java.util.Scanner;

public class desiredString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        int count = getCount(str);
        if(count<=1){
            System.out.println(-1);
        }else{
            System.out.println(count);
            int L = leftMostIndex(str);
            int R = rightMostIndex(str);
            String longestSbStr = longest_SubString(str, L, R);
            System.out.println(R-L+1);
            System.out.println(longestSbStr);
        }
        
    //     String longestSubStr = "";

    //     int count = 0;
    //     for (int i = 0; i < str.length(); i++) {
    //         for (int j = i + 1; j < str.length(); j++) {
    //             if (str.charAt(i) == 'A' && str.charAt(j) == 'A') {
    //                 String subStr = str.substring(i, j+1);
    //                 count++;
    //                 if (subStr.length() > longestSubStr.length()) {
    //                     longestSubStr = subStr;
    //                 }
    //             }

    //         }
    //     }
    //     if(count==0)System.out.println(-1);
    //     else{
    //         System.out.println(count);
    //         System.out.println(longestSubStr.length());
    //         System.out.println(longestSubStr);
        }
    
    


  //optimise-------------->
    public static int getCount(String str){
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)=='A')count++;
        }
        count = (count *( count -1)/2);
        return count;
    }
    public static int leftMostIndex(String str){
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)=='A')return i;
        }
        return -1;
    }
    public static int rightMostIndex(String str){
        for(int i = str.length()-1; i>=0; i--){
            if(str.charAt(i)=='A')return i;
        }
        return -1;
    }
    public static String longest_SubString(String str, int L, int R){
        String longest = str.substring(L,R+1);
        return longest;
    }
}
