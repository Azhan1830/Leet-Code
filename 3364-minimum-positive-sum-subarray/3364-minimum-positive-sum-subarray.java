class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min_sum = Integer.MAX_VALUE;
        int n = nums.size();
        
        for(int i=0; i<n; i++){
            int curr_sum = 0; //current sum
            for(int j=i; j<n; j++){
                curr_sum += nums.get(j);
                int len = j-i+1;

                if(len > r){
                    break;
                }
                if(len >= l && len <= r && curr_sum > 0){
                    min_sum = Math.min(min_sum, curr_sum);
                }
            }
        }
        return min_sum == Integer.MAX_VALUE ? -1 : min_sum;
    }
}