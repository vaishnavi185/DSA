/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Quik2
{
    static void  Quick(int[] arr, int high , int low){
        int pivot = arr[0];
        while ( low < pivot && high > pivot){
            low = low +1 ;
            high = high -1 ;
        }
        if ( low > high ){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
        }
        if(low < high){
            Quick(arr, high, low);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        
        Quick(arr, n - 1, 0);
        
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}