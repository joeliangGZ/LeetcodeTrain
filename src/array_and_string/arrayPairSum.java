package array_and_string;

import java.util.Arrays;

public class arrayPairSum {

    public int arrayPairSum(int[] nums) {

        int n = nums.length;
        Arrays.sort(nums);

        int total = 0;
        for(int i = 0; i < n; i+=2) {
            total += nums[i];
        }

        return total;
        
    }

    // 6,2,6,5,1,2
    // 6 6 
    // 5 2
    // 2 1
    
    // total + min(a, b)
    // sort 
    // i = n -1;
    // i-=2 while >= 0 
    
}
