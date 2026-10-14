package array_and_string.fast_slow_poniter;

public class minSubArrayLen {

    public int minSubArrayLen(int target, int[] nums) {
        
        int n = nums.length;

        int slow = 0, fast = 0;
        int total = 0;
        int minLen = Integer.MAX_VALUE;
        
        while(fast < n) {

            total += nums[fast];

            while(total >= target) { 
                minLen = Math.min(minLen, fast - slow + 1);
                total -= nums[slow];
                slow++;
            }

            fast++;

        }

        return minLen == Integer.MAX_VALUE? 0: minLen;
    }
    
}
