class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;

        int ts = 0; // total sum ke liye
        for(int num: nums){
            ts = ts+num;
        }
        int ls = 0; // left sun ke liye

        for(int i=0; i<n; i++){
            int rs = ts - ls - nums[i];

            if (ls == rs){
                return i;
            }
            ls = ls + nums[i];
        }
        return -1;
    }
}