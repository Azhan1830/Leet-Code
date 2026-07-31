class Solution {
    public int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;
        
        while (n > 0) {
            int digit = n % 10;  // Last digit nikali
            prod = prod * digit; // Product update kiya
            sum = sum + digit;   // Sum update kiya
            n = n / 10;          // Number ko chhota kiya
        }
        
        return prod - sum;
    }
}