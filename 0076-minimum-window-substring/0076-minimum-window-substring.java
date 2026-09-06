class Solution {
    public String minWindow(String s, String t) {
        /*
       1. Setup & Frequency Map (Hash Array)
       2. Initialize Pointers & Trackers 
       3. Expand the Window (Right Pointer)
       4. Shrink the Window (Left Pointer)
       5. Return Result
       */ 
       if (s == null || t == null || s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
            return "";
        }
        
        int[] hash = new int[256];
        for (char c : t.toCharArray()) {
            hash[c]++;
        }
        
        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int startIndex = -1;
        int count = 0; 
        
        while (right < s.length()) {
        
            if (hash[s.charAt(right)] > 0) {
                count++;
            }
        
            hash[s.charAt(right)]--;
        
            while (count == t.length()) {
                
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    startIndex = left;
                }
                
                hash[s.charAt(left)]++;

                if (hash[s.charAt(left)] > 0) {
                    count--;
                }
                left++; 
            }
            right++;
        }
        if(startIndex == -1){
            return "";
        }
        else{
            return s.substring(startIndex, startIndex + minLen);
        }
    }
}