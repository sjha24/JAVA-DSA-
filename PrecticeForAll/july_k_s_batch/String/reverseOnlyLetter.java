import java.util.Scanner;

public class reverseOnlyLetter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char arr[] = str.toCharArray();
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (!(arr[left] >= 'a' && arr[left] <= 'z' )&& !( arr[left] >= 'A' && arr[left] <= 'Z')) {
                left++;
            }else if (!(arr[right] >= 'a' && arr[right] <= 'z' )&& !(arr[right] >= 'A' && arr[right] <= 'Z')){
                right--;
            }else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;right--;
            }
        }
        str = new String(arr);
        System.out.println(str);
    }
}
