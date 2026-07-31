class Solution {
    public int divide(int dividend, int divisor) {
        // Edge Case: Overflow handle karna
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Final sign check karna
        boolean isNegative = (dividend < 0) != (divisor < 0);

        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);

        long result = 0;

        while (n >= d) {
            long tempDivisor = d;
            long count = 1;

            // Jab tak double kar sakte hain, double karte raho
            while (n >= (tempDivisor + tempDivisor)) {
                tempDivisor += tempDivisor;
                count += count;
            }

            n -= tempDivisor;
            result += count;
        }

        if (isNegative) {
            return (int) -result;
        } else {
            return (int) result;
        }
    }
}