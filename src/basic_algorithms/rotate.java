package basic_algorithms;

public class rotate {
    
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        int[] newArr = new int[n];

        for(int i = 0; i<n; i++) {
            newArr[(i+k)%n] = nums[i];
        }

        System.arraycopy(newArr, 0, nums, 0, n);
    }
    
    // Solution2-Timeout
    // public void rotate(int[] nums, int k) {
        
    //     int n = nums.length;
    //     for(int t = 0; t<k; t++) {
    //         int temp = nums[n-1];
    //         for(int i = n-1; i>0; i--) {
    //             nums[i] = nums[i-1];
    //         }
    //         nums[0] = temp;
    //     }
    // }
    
    // 输入: nums = [1,2,3,4,5,6,7], k = 3
    // 输出: [5,6,7,1,2,3,4]
    
    // 向右轮转 1 步: [7,1,2,3,4,5,6]
    // 向右轮转 2 步: [6,7,1,2,3,4,5]
    // 向右轮转 3 步: [5,6,7,1,2,3,4]

    // for k = 3 
    //     temp = nums n 
    //     for i = 1 i<n i++
    //         nums[i] = nums i-1
    //     nums 0 = temp;
}
