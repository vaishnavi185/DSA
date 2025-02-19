// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Selection {
    public  static void  sort(int[] nums){
         int n= nums.length;
         for(int i=0;i<n-1;i++){
             int min_idx=i;
             
             for(int j=i+1;j<n;j++){
                 if(nums[j]<nums[min_idx]){
                     min_idx=j;
                 }
                 
                 int temp = nums[i];
                 nums[i]=nums[min_idx];
                 nums[min_idx]= temp;
             }
             
         }
        
     }
     
     public static void main(String[] args) {
         int[] nums ={1,9,8,3,9,0};
      
         sort(nums);
         
         for(int num:nums){
             System.out.print(num +" ");
         }
       
         
     }
 }