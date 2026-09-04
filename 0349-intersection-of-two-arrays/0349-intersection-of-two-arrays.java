class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> a = new HashSet<>();
        for(int i=0; i<nums1.length; i++){
            a.add(nums1[i]);
        }
        HashSet<Integer> b = new HashSet<>();
        for(int i=0; i<nums2.length; i++){
            if(a.contains(nums2[i])){
                b.add(nums2[i]);
            }
        }
        int[] res = new int[b.size()];
        int i = 0;
        Object[] arr = b.toArray();
        for(int j=0; j<arr.length; j++){
            res[i++] = (int) arr[j];
        }
        return res;
    }
}