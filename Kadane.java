public class Kadane {
    public int maxSubArray(int[] arr){

        int max_end=arr[0]; 
        int max_far=arr[0];
        for(int i=0;i<arr.length;i++){
            max_end=Math.max(arr[i],max_end+arr[i]);
            max_far=Math.max(max_end,max_far);
        }
            return max_far;
        }
    
        public static void main(String[] args){
            int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
            Kadane k =new Kadane();
            int r = k.maxSubArray(arr);
            System.out.println(r);
        }

    }

