class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        int len = 0;
        boolean hasOdd = false;

        for (int count: map.values()) {
            if (count % 2 == 0) {
                len += count;
            } else {
                len += count - 1;
                hasOdd = true;
            }
        }
        if (hasOdd) {
            len += 1;
        }
        return len;
    }
}