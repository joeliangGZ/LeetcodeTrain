package array.slide_window;

public class minSubArrayLen {

    public int minSubArrayLen(int target, int[] nums) {
        
        int n = nums.length;
        int sum = 0;

        int start = 0, end = 0;
        int ans = Integer.MAX_VALUE;

        while(end<n){
            
            sum+=nums[end];

            while(sum>=target) {
                sum-=nums[start];
                ans = Math.min(ans, end-start+1);
                start++;
            }

            end++;
        }
        
        return ans == Integer.MAX_VALUE? 0: ans;
    }

    // 输入：target = 7, nums = [2,3,1,2,4,3]
    // 输出：2
    
}
