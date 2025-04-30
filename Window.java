public class Window {
    public int wimdow(int[] arr,int k){
        int n=arr.length;
        int max_sum=0;
        
        for (int i = 0; i < k; i++) {
          max_sum+=arr[i];
        }

        int windowsum=max_sum;
        for(int i =k;i<n;i++)
{
        windowsum+=arr[i]-arr[i-k];
        max_sum=Math.max(max_sum, windowsum);
}
return max_sum;
    }
    public static void main(String[] args){
       int[] arr={1,9,0,8,6,7};
       int k=2;
       Window w= new Window();
       int r =w.wimdow(arr,k);
       System.out.println(r);
    }
}
