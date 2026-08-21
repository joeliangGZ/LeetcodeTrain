package array;

public class reverseVowels {

    public String reverseVowels(String s) {

        int n = s.length();
        int i = 0, j = n -1;
        char[] arr = s.toCharArray();
        
        while(i < j){
            while(i < n && !isVowel(arr[i])) {
                i++;
            }

            while(j > 0 && !isVowel(arr[j])) {
                j--;
            }

            if(i<j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return new String(arr);
    }

    boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) >= 0;
    }

    void swap(char[] arr, int left, int right){
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    // 输入：s = "IceCreAm"
    // 输出："AceCreIm"

    // I c e C r e A m
    // m a e c r e c i

    // 输入：s = "leetcode"
    // 输出："leotcede"

    // charset 
    // int i = 0, j = n-1;
    // if in charset swap
    
}
