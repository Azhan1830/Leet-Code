class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProduct = Integer.MIN_VALUE;
        int suffix = 1;
        int prefix = 1;

        for(int i=0; i<n; i++){
            if(suffix == 0){
                suffix = 1;
            }
            if(prefix == 0){
                prefix = 1;
            }
            suffix = suffix * nums[i];
            prefix = prefix * nums[n-i-1];
            maxProduct = Math.max(maxProduct, Math.max(suffix, prefix));
        }
        return maxProduct;
    }
}