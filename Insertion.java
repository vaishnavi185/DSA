public class Insertion {
    public static void sort(int[] nums){
         for(int i=1;i<nums.length;i++){

            // int key = nums[i];

            // if(key>nums[i]){
            //     key = nums[i];

            // }

            int key = nums[i];
            int j=i-1;
            while(j>=0 && nums[j]>key){
                nums[j+1]=nums[j];
                j=j-1;
            }
            nums[j+1]=key;
           
           
         }
    }
    public static void main(String[] args) {
        int[] nums={1,0,9,8};
        sort(nums);
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}
