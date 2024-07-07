public class FindZero {
    static void   zero(int[] a, int size){
        int nz =0;
        int n= size-1;
          while(nz < n){
  
        if(a[nz]==0){
            int temp = a[nz];
          a[nz]=a[n];
          a[n]= temp;
          
          n--;
        }
        else{
          nz++;
        }
          }
  
      }
      public static void main(String args[]){
       int arr[]={1,2,3,0,8,9,0,9,0};
       int size = arr.length;
       zero(arr,size);
       for (int i : arr) {
        System.out.print(i + " ");
    }
  
      }
}

