package array;

public class isPalindrome {
    public boolean isPalindrome(String s) {

        String replaced = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int n = replaced.length();

        int left = 0, right = n - 1;
        while (left < right) {
            if (replaced.charAt(left++) != replaced.charAt(right--)) {
                return false;
            }
        }

        return true;
    }
}
