package basic_algorithms;

public class reverseString {

    public void reverseString(char[] s) {

        int n = s.length;
        int left = 0, right = n-1;
        
        while(left < right) {
            swap(s, left, right);
            left++;
            right--;
        }
        
    }

    void swap(char[] arr, int left, int right){
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    
}
