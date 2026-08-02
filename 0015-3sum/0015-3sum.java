class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int Sum = nums[i] + nums[left] + nums[right];
                
                if (Sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    left++;
                    right--;
                    
                    // Left pointer pe duplicates skip karo
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    
                    // Right pointer pe duplicates skip karo
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } 
                else if (Sum < 0) {
                    left++;
                } 
                else {
                    right--;
                }
            }
        }
        
        return result;
    }
}