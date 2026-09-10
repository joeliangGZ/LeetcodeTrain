package array_and_string.strings;

public class strStr_kmp {

    public int strStr(String text, String pattern) {

        if(pattern == null || pattern.length() == 0) return -1;

        int m = text.length();
        int n = pattern.length();

        int[] next = computeNext(pattern);

        int i = 0;
        int j = 0;
        
        while(i<m) {
            if(pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }

            if(j==n) {
                return i - j;
            } else if (i<m && pattern.charAt(j) != text.charAt(i)) {
                if(j != 0) {
                    j = next[j-1];
                } else{
                    i++;
                }
            }
        }
        
        return -1;
    }

    int[] computeNext(String pattern) {
        
        int n = pattern.length();
        int[] next = new int[n];

        int len = 0;
        int i = 1;
        
        next[0] = 0;

        while(i < n){
            if(pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                next[i] = len;
                i++;
            } else {
                if(len!=0) {
                    len = next[len-1];
                } else {
                    next[i] = 0;
                    i++;
                }
            }
        }

        return next;
    }
}
    