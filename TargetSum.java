import java.util.Arrays;

public class TargetSum {
    public static void TargetSum(int[] arr, int left ,int  right,int x){
        while(left<right){
            if(arr[left]+arr[right]==x){
                System.out.println("pair found:("+arr[left]+','+arr[right]+')');
            }
            if(arr[left]+arr[right]>x){
                right--;
            }
            else{
                left++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,3,4,8,9};
        Arrays.sort(arr);
        int x=12;
        int left =0;
        int right=arr.length-1;
        TargetSum(arr, left, right, x);
    }
}
