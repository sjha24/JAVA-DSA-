import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int count  =0;
        String longest = "";
        for(int start = 0; start<str.length(); start++){
            for(int end = start+1;end<str.length(); end++){
                if(str.charAt(start)=='A' && str.charAt(end)=='A'){
                    count++;
                    String subString = str.substring(start, end+1);
                    if(subString.length() >longest.length()){
                        longest = subString;
                    }
                }
            }
        }
        if(count == 0){
            System.out.println(-1);
        }else{
            System.out.println(count);
            System.out.println(longest.length());
            System.out.println(longest);
        }
    }
}
