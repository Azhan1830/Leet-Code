class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];

        int left = 0;
        int right = n-1;

        int arr_indx = n-1;

        while(left <= right){
            int ls = nums[left] * nums[left];
            int rs = nums[right] * nums[right];

            if(ls > rs){
                arr[arr_indx] = ls;
                left++;
            }
            else{
                arr[arr_indx] = rs;
                right--;
            }
            arr_indx--;
        }
        return arr;
    }
}