class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxSum = nums[0];
        int currMax = 0;
        int minSum = nums[0];
        int currMin = 0;

        for (int i=0; i<nums.length; i++) {
            int num = nums[i];
            totalSum += num;

            currMax = Math.max(currMax + num, num);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(currMin + num, num);
            minSum = Math.min(minSum, currMin);
        }
        if (maxSum < 0) return maxSum;
        return Math.max(maxSum, totalSum - minSum);
    }
}