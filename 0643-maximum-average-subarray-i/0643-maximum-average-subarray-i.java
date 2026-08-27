class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int max_sum = Integer.MIN_VALUE;
        
        for(int i=0; i<=n-k; i++){
            int current_sum=0;
            for(int j=i; j<i+k; j++){
                current_sum += nums[j];
            }

            max_sum = Math.max(max_sum, current_sum);
        }
        return (double) max_sum/k;
    }
}