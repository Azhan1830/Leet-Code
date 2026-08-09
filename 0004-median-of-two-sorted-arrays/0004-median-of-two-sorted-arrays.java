class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int l = n + m;
        int[] arr = new int[l];
        
        int i = 0, j = 0, k = 0;
        
        while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
                arr[k++] = nums1[i++];
            } else {
                arr[k++] = nums2[j++];
            }
        }
        
        while (i < n) arr[k++] = nums1[i++];
        while (j < m) arr[k++] = nums2[j++];
        
        if (l % 2 == 1) { 
            return (double) arr[l / 2];
        } else { 
            return ((double) arr[l / 2] + (double) arr[(l / 2) - 1]) / 2.0;
        }
    }
}