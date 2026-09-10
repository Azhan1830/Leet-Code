class Solution {
    public int missingNumber(int[] nums) 
    {

        int n = nums.length;
        int total = n * (n + 1) / 2; // total sum
        int a = 0; // actual sum

        for (int i=0; i<n; i++)  
        {
            a = a + nums[i];
        }

        return total - a;
    }
}