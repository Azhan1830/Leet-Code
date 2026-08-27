class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int current_sum = 0;
        // first k elements sum
        for(int i=0; i<k; i++){
            current_sum += nums[i];
        }

        int max_sum = current_sum;

        // slide window till end
        for(int i=k; i<nums.length; i++){
            current_sum = current_sum + nums[i] - nums[i-k];

            max_sum = Math.max(max_sum, current_sum);
        }
        // return avergae
        return (double) max_sum/k;
    }
}