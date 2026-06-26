class Solution {
    public void sortColors(int[] arr) {
        if (arr.length == 0) return;

        // Find the maximum element
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        // Create count array
        int[] count = new int[max + 1];

        // Store frequency of each element
        for (int num : arr) {
            count[num]++;
        }

        // Reconstruct the sorted array
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index] = i;
                index++;
                count[i]--;
            }
         }
    }   
}