class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int i = 1;
        while (i<n){
            nums[i] = nums[i] + nums[i-1];
            i++;
        }
        return nums;
    }
}