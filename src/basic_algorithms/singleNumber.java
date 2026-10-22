package basic_algorithms;

public class singleNumber {

    public int singleNumber(int[] nums) {

        int single = 0;
        for(int num : nums){
            single ^= num;
        }

        return single;
        
    }

    // 示例 1 ：
    // 输入：nums = [2,2,1]
    // 输出：1

    // 示例 2 ：
    // 输入：nums = [4,1,2,1,2]
    // 输出：4

    // 示例 3 ：
    // 输入：nums = [1]
    // 输出：1
    
}
