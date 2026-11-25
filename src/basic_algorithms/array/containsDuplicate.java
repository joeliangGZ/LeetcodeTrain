package basic_algorithms.array;

import java.util.Arrays;

public class containsDuplicate {
    
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i<n-1; i++ ){
            if(nums[i] == nums[i+1]) return true;
        }

        return false;
    }
}