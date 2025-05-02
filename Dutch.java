public class Dutch{

    public static int[] flag(int[] arr){
        int low=arr[0];
        int mid=arr[0];
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp =arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp = arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;
            }
        }return arr;
    }
    public static void main(String[] args) {
        int[] arr ={0,0,1,2,0,2,1};
        Dutch d=new Dutch();
        d.flag(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}