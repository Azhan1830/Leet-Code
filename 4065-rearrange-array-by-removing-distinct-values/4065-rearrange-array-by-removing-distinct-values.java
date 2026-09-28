class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int freq[] = new int[101];
        for (int i : nums) {
            freq[i]++;
        }

        int ans[] = new int[n];
        int j = 0;
        for (int i=0; i<n; i++) {
            while (true) {
                j++;
                j %= 101;
                if (freq[j] != 0) {
                    ans[i] = j;
                    freq[j]--;
                    break;
                }
            }
        }
        return ans;
    }
}