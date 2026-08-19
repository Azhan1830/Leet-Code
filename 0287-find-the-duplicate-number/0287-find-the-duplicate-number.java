class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> a = new HashSet<>();
        for(int i:nums){
            if(a.contains(i)){
                return i;
            }
            a.add(i);
        }
        return -1;
    }
}