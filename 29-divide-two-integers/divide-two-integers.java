class Solution {
    public int divide(int dividend, int divisor) {
        
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; 
        }
        long result = (long) dividend / (long) divisor;
        if (result < Integer.MIN_VALUE) {
            return (Integer.MIN_VALUE); 
        }

       
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;  
        }
       
        return (int) result;
    }
}
