class Solution {
    public int[] rearrangeArray(int[] nums) {
        // Frequency map aur max frequency nikalo
        Map<Integer, Integer> freqMap = new HashMap<>();
        int maxFreq = 0;
        
        for (int num : nums) {
            int count = freqMap.getOrDefault(num, 0) + 1;
            freqMap.put(num, count);
            maxFreq = Math.max(maxFreq, count);
        }
        
        // Unique elements ko nikal kar SORT karo (sirf ek baar!)
        List<Integer> uniqueElements = new ArrayList<>(freqMap.keySet());
        Collections.sort(uniqueElements);
        
        // Result array banao
        int[] ans = new int[nums.length];
        int idx = 0;
        
        // Operations simulate karo 1 se maxFreq tak
        for (int op = 1; op <= maxFreq; op++) {
            // Har baar sorted distinct values mein se check karo
            for (int num : uniqueElements) {
                // Agar is element ki original count is operation tak valid hai
                if (freqMap.get(num) >= op) {
                    ans[idx++] = num;
                }
            }
        }
        
        return ans;
    }
}