package basic_algorithms.strings;

public class myAtoi {

    public int myAtoi(String s) {
        
        int n = s.length();
        int i = 0;
        
        while(i < n && s.charAt(i) == ' ') {
            i++;
        }

        if(i == n) return 0;

        int sign = 1;
        if(s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        int res = 0;
        int boundary = Integer.MAX_VALUE / 10;
        while(i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            
            if(res > boundary || (res == boundary && digit > 7)) {
                return sign == 1? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            res = res*10 + digit;
            i++;
            
        }

        return res * sign;
    }
    
}
