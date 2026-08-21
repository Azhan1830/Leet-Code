class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int cs=nums[0]+nums[1]+nums[2]; //cs=closest sum
        int n=nums.length;

        for(int i=0; i<n-2; i++){
            int left=i+1;
            int right=n-1;

            while(left < right){
                int curr_sum=nums[i]+nums[left]+nums[right];
                if(Math.abs(target-curr_sum) < Math.abs(target-cs)){
                    cs=curr_sum;
                }
                if (curr_sum == target){
                    return curr_sum;
                }
                else if(curr_sum < target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return cs;
    }
}