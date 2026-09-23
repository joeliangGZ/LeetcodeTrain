package array_and_string;

public class removeElementSlowFast {

    public int removeElement(int[] nums, int val) {

        int n = nums.length;
        int fast = 0, slow =0;

        while(fast<n) {
            if(nums[fast] != val){
                nums[slow] =  nums[fast];
                slow++;
            }

            fast++;
        }
        
        return slow;
    }

}