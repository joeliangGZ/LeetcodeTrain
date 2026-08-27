package array_and_string;

public class searchInsert {

    public int searchInsert(int[] nums, int target) {
        
        int n = nums.length;
        int ans = n;

        int left = 0, right = n -1; 
        while(left <= right) {

            int mid = left + (right - left) / 2;
            if(nums[mid] >= target) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            
        }

        return ans;
    }
    

    
}
