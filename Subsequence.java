public class Subsequence {
   public static void main(String[] args) {
     int[] arr ={-2,-9,0,8,7};
     int sum=0;
     int max= Integer.MIN_VALUE;
     for(int i=0;i<arr.length;i++){
       

            sum+=arr[i];
            if(sum>max){
                max=sum;
            }
            if(sum<=0){
                sum=0;
            }
        }
     
     System.out.println(max);
   }
   

}
