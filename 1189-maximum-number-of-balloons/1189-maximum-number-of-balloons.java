class Solution {
    public int maxNumberOfBalloons(String text) {
        /*
        1. Count frequencies
        2. Calculate potential words each letter can support
        3. Find the minimum
        */
        int[] freq = new int[26];
        for(char i: text.toCharArray()){
            freq[i - 'a']++;
        }

        int b = freq['b' - 'a'];
        int a = freq['a' - 'a'];
        int l = freq['l' - 'a'];
        int o = freq['o' - 'a'];
        int n = freq['n' - 'a'];

        l /= 2;
        o /= 2;

        int minBallon = Math.min(b ,a);
        minBallon = Math.min(minBallon, l);
        minBallon = Math.min(minBallon, o);
        minBallon = Math.min(minBallon, n);

        return minBallon;
    }
}