class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        // Converting both strings to array sice strings are immutable
        char[] s_char = s.toCharArray();
        char[] t_char = t.toCharArray();

        // Sort them
        Arrays.sort(s_char);
        Arrays.sort(t_char);

        // Compare
        return Arrays.equals(s_char, t_char);
    }
}