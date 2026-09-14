package array_and_string.strings;

public class reverseString {

    public void reverseString(char[] s) {
        
        int n = s.length;
        int left = 0, right = n-1;

        while (left < right) {
            swap(s, left, right);
            left++;
            right--;
        }
    }

    void swap(char[] nums, int left, int right){
        char temp = nums[left];
        nums[left] =nums[right];
        nums[right] = temp;
    }

    // ["h","e","l","l","o"]
    // ["o","l","l","e","h"]
    
}
