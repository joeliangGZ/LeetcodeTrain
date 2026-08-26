package array_and_string;

import java.util.Arrays;

public class pivotIndex {

    public int pivotIndex(int[] nums) {

        int n = nums.length;
        int total = Arrays.stream(nums).sum();
        int sum = 0;

        for(int i = 0; i < n; i++) {

            if(2*sum + nums[i] == total) {
                return i;
            }
            
            sum += nums[i];
        }

        return -1;
        
    }

    // 设左边和为 sum 两边相等即 2*sum + nums[i] = total;

    // 输入：nums = [1, 7, 3, 6, 5, 6]
    // 输出：3
    // sumleft  sumright

    // 1 i = 0 
    
}
