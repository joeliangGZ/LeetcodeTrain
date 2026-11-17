package basic_algorithms;

public class isPalindrome {
    
    public boolean isPalindrome(String s) {

        String replace = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int n = replace.length();
        int left = 0, right = n-1;
        while(left < right) {
            if (replace.charAt(left) != replace.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
        
    }
}
