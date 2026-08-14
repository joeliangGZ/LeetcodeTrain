package array;

public class quickSort {

    public void quickSort(int[] nums) {
        
        int n = nums.length;
        
        int left = 0, right = n - 1;

        quicksort(nums, left, right);
    }
    
    void quicksort(int[] nums, int left, int right) {
        if(left>=right) return;

        int pivotIndex = partition(nums, left, right);

        quicksort(nums, left, pivotIndex -1);
        quicksort(nums, pivotIndex+1, right);
    }

    int partition(int[] nums, int left, int right) {
        
        int i = left-1;

        int pivot = nums[right];
        
        for(int j = left; j < right; j++) {
            if(nums[j] < pivot) {
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
