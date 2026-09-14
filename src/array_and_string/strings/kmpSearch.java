package array_and_string.strings;

public class kmpSearch {

    public void kmpSearch(String text, String pattern) {

        if(pattern == null || pattern.length() == 0) return;

        int m = text.length();
        int n = pattern.length();

        int[] lps = computeLps(pattern);

        int j = 0;
        for(int i =0; i<m; i++){
            while(j > 0 && text.charAt(i) != pattern.charAt(j)) {
                j = lps[j-1];
            }

            if(text.charAt(i) == pattern.charAt(j)) {
                j++;
            }

            if(j == n) {
                j = lps[j-1];
            }
        }
        
    }

    int[] computeLps(String pattern){
        
        int n = pattern.length();
        int[] lps = new int[n];

        int len = 0;

        for(int i = 1; i< n; i++){
            while(len != 0 && pattern.charAt(i) != pattern.charAt(len)) {
                len = lps[len - 1];
            }

            if(pattern.charAt(i) == pattern.charAt(len)){
                len++;
            }

            lps[i] = len;
        }
        
        return lps;
    }
    
}
