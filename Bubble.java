class Bubble{

     public static void sort(int[] nums){
        int n= nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if ((nums[j]>nums[j+1])) {
                    int temp=nums[j];
                    nums[j]= nums[j+1];
                    nums[j+1]= temp;
                }
            }
        }
     }
    public static void main(String[] args){
           int[] nums={7,10,3,8,9,6}; 
           sort(nums);
           for(int num:nums){
            System.out.print(num+" ");
           } 
          }
}