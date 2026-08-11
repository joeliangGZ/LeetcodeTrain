package array;

public class removeDuplicates {
    public int removeDuplicates(int[] nums) {

        int n = nums.length;
        
        if(n == 0) return 0;

        
        int left = 1, right = 1;

        while(right<n) {
            
            if(nums[right] != nums[right-1]){
                nums[left]=nums[right];
                left++;
            }

            right++;
        }

        return left;
    }


    // 0,0,1,1,1,2,2,3,3,4
    // 0 1 1
    // 0 1 1 1 1
    // 0 1 2 1 1 2
    // 0 1 2 3 1 2 2 3 
    // 0 1 2 3 1 2 2 3 3 
    // 0 1 2 3 4 2 2 3 3 4
    
}
