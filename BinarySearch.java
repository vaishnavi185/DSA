import java.util.Arrays;

public class BinarySearch {
    public static  int binarysearch(int[] arr,int target,int low,int high,int mid){
        while(low<=high){
            mid=(low+high)/2; 
            if(mid==target){
                System.out.println("elemnt found:"+mid);
                return 1;
            }
            else if(arr[mid]<target){
                high=mid-1;
                
            }
            else if(arr[mid]>target){
                low=mid+1;
            }

        }

        System.out.println("Element not found");
        return -1;
    }
    public static void main(String[] args){
          int[] arr={1,8,9,0,6} ;
          Arrays.sort(arr);
          int target=7;
          int low=0;
          int high=arr.length-1;
          int mid=low+high/2;
          binarysearch(arr, target, low, high, mid);

    }
}
