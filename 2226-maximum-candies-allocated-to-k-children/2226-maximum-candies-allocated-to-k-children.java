class Solution {
    public int maximumCandies(int[] candies, long k) {
        int low = 1;
        int high = 10_000_000;
        int ans = 0;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(canDistribute(candies, k, mid)) {
                ans = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }
    private boolean canDistribute(int[] candies, long k, int mid) {
        long totalChildren = 0;
        for(int i: candies) {
            totalChildren += i / mid;
        }
        return totalChildren >= k;
    }
}