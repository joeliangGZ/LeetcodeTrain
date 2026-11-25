package basic_algorithms.strings;

public class strStr {
    
    public int strStr(String haystack, String needle) {

        int m = haystack.length();
        int n = needle.length();

        for(int i =0; i + n <=m; i++) {
            
            int j = 0;

            while(j < n && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if(j == n) return i;
        }

        return -1;
        
    }
}
