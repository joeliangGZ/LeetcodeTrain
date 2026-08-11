package array;

class removeElement {
    public int removeElement(int[] nums, int val) {
        
        int left = 0, right = 0, n = nums.length;

        while(right<n){
            if(nums[right] != val) {
                // count++;
                swap(nums, left, right);
                left++;
                
            }

            right++;
        }

        return left;
        
    }

    void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] =nums[right];
        nums[right] = temp;
    }

    // 3 2 2 3 
    // 3 2 2 3 left 
    // 2 3 2 3 
    // 2 2 3 3 left 
}