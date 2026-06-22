class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        // Reverse whole array
        reverse(nums, 0, nums.length - 1);

        // Reverse first k elements
        reverse(nums, 0, k - 1);

        // Reverse remaining elements
        reverse(nums, k, nums.length - 1);
    }

    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] nums, int indx1, int indx2) {
        int temp = nums[indx1];
        nums[indx1] = nums[indx2];
        nums[indx2] = temp;
    }
}