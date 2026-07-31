class Solution {
    public int mySqrt(int x) {
        // Base cases: 0 ka root 0, 1 ka root 1
        if (x==0 || x==1) {
            return x;
        }

        int low = 1;
        int high = x;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Integer overflow se bachne ke liye multiplication ki jagah division check kar rahe hain
            if (mid <= x / mid) {
                ans = mid;      // mid ek potential answer hai, isko save karo
                low = mid + 1;  // Ab aur bade number ke liye right half me dhoondho
            } else {
                high = mid - 1; // mid bada ho gaya, toh left half me dhoondho
            }
        }

        return ans;
    }
}