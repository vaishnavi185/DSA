class Summ{
    public static void main(String[] args){
         int[] nums={-1,0,1,2,2};
    
         
         for(int i=0;i<nums.length-2;i++){
             for(int j=1;j<nums.length-1;j++){
                int k = -(nums[i]+nums[j]);

                for(int l=2;l<nums.length;l++){
                    if(nums[l]==k){
                        if(nums[i]!=nums[j] && nums[j]!=nums[l] && nums[l]!=nums[i]){
                            int sum = nums[i] + nums[j] + nums[l];
                            if (sum == 0) {
                                System.out.println("Triplet found: " + nums[i] + ", " + nums[j] + ", " + nums[l]);
                        }
                      
                    }
                }
             }
         }
         
    }
}}