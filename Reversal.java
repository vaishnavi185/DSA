public class Reversal{
    public void revrse(int[] arr,int left,int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }


    }
    public static void main(String[] args) {
        int[] arr={1,7,9,0};
        int left=0;
        int right=arr.length-1;
        Reversal r = new Reversal();
        r.revrse(arr, left, right);
        for (int num : arr) {
            System.out.print(num + " ");
        }
       
    }
}