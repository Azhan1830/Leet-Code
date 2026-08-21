class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        int cs=Integer.MAX_VALUE/2; //cs=closet_sum
        int md=Integer.MAX_VALUE; //md=min difference

        for(int i=0;i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    int s=nums[i]+nums[j]+nums[k]; //s=current sum
                    int diff=Math.abs(target-s); //diff=current diff
                    if(diff<md){
                        md=diff;
                        cs=s;
                    }
                }
            }
        }
        return cs;
    }
}