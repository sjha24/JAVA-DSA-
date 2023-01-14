public class print_a_c_e {
    public static void main(String[] args) {
        // for(char ch = 'a'; ch<='z';ch+=2){
        //     System.out.println(ch);
        // }
        for(int i = 0;i<26;i+=2){
            char ch = (char)('a'+i);
            System.out.println(ch);
        }
    }
}
