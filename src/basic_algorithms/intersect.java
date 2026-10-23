package basic_algorithms;

import java.util.Arrays;

public class intersect {
    
    // sort & two pointer
    public int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int n1 = nums1.length;
        int n2 = nums2.length;

        int i = 0, j = 0, k = 0;
        int[] res = new int[Math.min(n1, n2)];

        while(i < n1 && j < n2) {
            
            if(nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                res[k] = nums1[i];
                k++;
                i++;
                j++;
            }
        }

        return Arrays.copyOfRange(res, 0, k);
        
    }

    // 输入：nums1 = [1,2,2,1], nums2 = [2,2]
    // 输出：[2,2]

    // 1 1 2 2
    // 2 2

    // 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
    // 输出：[4,9]

    // 4 5 9 
    // 4 4 8 9 9
    // 4 9 

}