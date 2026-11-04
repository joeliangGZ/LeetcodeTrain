package basic_algorithms;

public class moveZeroes {

    public void moveZeroes(int[] nums) {

        int n = nums.length;

        // 左指针指向当前已经处理好的序列的尾部，右指针指向待处理序列的头部。
        int left = 0, right = 0;

        while (right < n) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }

            right++;
        }

    }

    void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

}
