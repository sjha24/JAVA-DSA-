public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        System.out.println(LastOccurence(arr, target));

    }
    public static int LastOccurence(int arr[], int target){
        int left = 0; int right = arr.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]<=target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        if(right == -1 ||arr[left] != arr[right])return -1;
        return right;
    }
}
