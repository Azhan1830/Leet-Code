class Solution {
    public int findMiddleIndex(int[] nums) {
        int ts = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            ts += nums[i];
        }

        int ls = 0;

        for (int i = 0; i < n; i++) {
            int rs = ts - ls - nums[i];

            if (ls == rs) {
                return i;
            }

            ls += nums[i];
        }

        return -1;
    }
}