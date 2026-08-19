class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> a = new HashMap<>();
        a.put(0,1);
        int sum=0; //prefixsum
        int count=0;
        int n=nums.length;
        for(int i=0; i<n; i++){
            sum+=nums[i];

            int r=sum-k; //r=check kr rhe ki (sum-k) 'a' me hai ki nhi
            if(a.containsKey(r)){
                count+=a.get(r); //uska frequency count bhada dege
            }
            a.put(sum,a.getOrDefault(sum,0)+1);
        }
        return count;
    }
}