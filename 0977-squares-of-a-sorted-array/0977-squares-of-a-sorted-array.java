class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n-1;

        int result_index = n- 1;

        while(left <= right){
            int ls = nums[left]*nums[left];
            int rs = nums[right]*nums[right];

            if (ls>rs){
                result[result_index] = ls;
                left++;
            }
            else{
                result[result_index] = rs;
                right--;
            }
            result_index--;
        }
        return result;
    }
}