import java.util.*;

class Solution {
    public String largestNumber(int[] arr) {

        // Convert int array to String array
        String[] nums = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            nums[i] = String.valueOf(arr[i]);
        }

        // Sort using custom comparator
        Arrays.sort(nums, (a, b) -> (b + a).compareTo(a + b));

        // If the largest number is 0
        if (nums[0].equals("0")) {
            return "0";
        }

        // Build the result
        StringBuilder result = new StringBuilder();

        for (String num : nums) {
            result.append(num);
        }

        return result.toString();
    }
}