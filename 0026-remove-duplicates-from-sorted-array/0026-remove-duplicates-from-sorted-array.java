class Solution {
    public int removeDuplicates(int[] nums) {
        int officer = 0;
        int resident = 1;
        int cm = 1;
        int n = nums.length;
        while (cm < n){
            if (nums[cm] == nums[cm-1]){
                cm ++;
            }
            else{
            nums[officer + 1] = nums[cm];
            officer++;
            resident++;
            cm++;
            }
        }
        return resident;
    }
}