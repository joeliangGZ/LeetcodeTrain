package array_and_string;

public class findMaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {

        int n = nums.length;
        int max = 0;
        int slow = 0;
        
        for(int fast = 0; fast < n; fast++) {
        
            if (nums[fast] == 0) {
                slow = fast +1;
            } else {
                max = Math.max(max, fast - slow + 1);
            }
        }

        return max;
        
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
