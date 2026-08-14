class Solution {
    public int removeElement(int[] nums, int val) {
        int[] temp = new int[nums.length];
        int k = 0; // for tracking temp index

        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                temp[k] = nums[i];
                k++;
            }
        }
        for(int i=0; i<k; i++){
            nums[i] = temp[i];
        }
        return k;
    }
}