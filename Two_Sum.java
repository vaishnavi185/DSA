import java.util.HashMap;

public class Two_Sum {
    public static void main(String[] args){
        int[] nums = {1, 8, 9, 0};
        int target = 17;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];

        for(int i = 0; i < nums.length; i++){
            int n = target - nums[i];
            if(map.containsKey(n)){
                res[0] = map.get(n); // Get the index of the complement
                res[1] = i; // Current index
                break; // Stop after finding the first valid pair
            }
            map.put(nums[i], i); // Store the number and its index
        }

        System.out.println("[" + res[0] + ", " + res[1] + "]");
    }
}
