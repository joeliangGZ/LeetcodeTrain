package basic_algorithms;

public class reverseInteger {
    
    public int reverse(int x) {

        String val = String.valueOf(x);
        boolean isNegative = x < 0;
        
        val = isNegative ? val.substring(1): val;
        
        String reversed = new StringBuilder(val).reverse().toString();

        reversed = isNegative? "-" + reversed : reversed;

        try {
            return Integer.parseInt(reversed);
        } catch( Exception e) {
            return 0;
        }

    }
}
