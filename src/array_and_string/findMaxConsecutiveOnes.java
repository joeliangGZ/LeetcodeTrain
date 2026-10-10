package array_and_string;

public class findMaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {

        int n = nums.length;

        int slow = 0, fast = 0;
        int maxLen = 0;
        
        while(fast < n) {
            if(nums[fast] == 1) {
                maxLen = Math.max(maxLen, fast - slow + 1);
            } else {
                slow = fast + 1;
            }
            
            fast++;
        }

        return maxLen;
        
    }
    //     slow
    // 1,1,0,1,1,1  3
    // while fast == 1 
    // fast++;
    
    // if max <= (fast - slow) 
    //     max = fast - slow;

    // fast++;

    // for(int fast = 0; fast < n; fast++) {
        
    //     if fast == 1 continue;
        
    //         if max <= (fast - slow) 
    //             max = fast - slow;
    //             slow = slow + max;
        
    // }

}
