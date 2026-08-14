package array;

public class findKthLargest {
    public int findKthLargest(int[] nums, int k) {
        
        int n = nums.length;
        int kIndex = n - k;
        
        int left = 0, right = n -1;

        return quickSelect(nums, left, right, kIndex);
    }
    
    int quickSelect(int[] nums, int left, int right, int kIndex) {
        // if(left>=right) return;

        int pivotIndex = partition(nums, left, right);

        if(pivotIndex == kIndex){
            return nums[pivotIndex];
        } else if (pivotIndex < kIndex) {
            return quickSelect(nums, pivotIndex + 1, right, kIndex);
        } else {
            return quickSelect(nums, left, pivotIndex - 1, kIndex);
        }
    }

    int partition(int[] nums, int left, int right) {
        
        int i = left-1;

        int provix = nums[right];
        
        for(int j = left; j < right; j++) {
            if(nums[j] < provix) {
                i++;
                swap(nums, i, j);
            }
        }

        swap(nums, i+1, right);

        return i+1; 
    }

    

    void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] =nums[right];
        nums[right] = temp;
    }
}
