class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                // 1-indexed array ke liye +1 kar rahe hain
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;  // Sum chhota hai, toh left pointer aage badhao (bada number lene ke liye)
            } else {
                right--; // Sum bada hai, toh right pointer peeche lao (chhota number lene ke liye)
            }
        }

        return new int[]{};
    }
}