package basic_algorithms;

public class plusOne {

    public int[] plusOne(int[] digits) {
        
        int n = digits.length;
        
        for(int i = n-1; i >= 0; i--) {
            
            if(digits[i] != 9) {
                digits[i]++;
                return digits;
            }

            // set cur to 0, keep move forward
            digits[i] = 0;
        }

        // still no return - all is 9
        int[] res = new int[n+1];
        res[0] = 1;
        return res;
        
    }

    // 输入：digits = [4,3,2,1]
    // 输出：[4,3,2,2]
    // 解释：输入数组表示数字 4321。
    // 加 1 后得到 4321 + 1 = 4322。
    // 因此，结果应该是 [4,3,2,2]。
    // 4309
    // 4310
    // 4319
    // 4320
    // 9999
    // 10000
    
}
