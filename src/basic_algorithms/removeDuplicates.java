package basic_algorithms;

public class removeDuplicates {

    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j = 1;
        
        for(int i =1; i< n;i++) {
            if (nums[i] != nums[i-1]) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }

    // 1  1  2
    //   ij  i
    // 0 0 1 2 2 3 4
    //   ij i
    
}
