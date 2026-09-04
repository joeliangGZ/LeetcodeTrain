package array_and_string.strings;

public class longestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0) {
            return "";
        }
        
        int n = strs.length;

        String prefix = strs[0];
        for(int i = 0; i< n; i++){
            
            prefix = longestCommonPrefix(prefix, strs[i]);
            if(prefix.length() == 0 ) {
                break;
            }
        }

        return prefix;
    }

    String longestCommonPrefix(String str1, String str2){
        
        int length = Math.min(str1.length(), str2.length());

        int index = 0;
        while(index < length && str1.charAt(index) == str2.charAt(index)) {
            index++;
        }

        return str1.substring(0, index);
    }
    
}
