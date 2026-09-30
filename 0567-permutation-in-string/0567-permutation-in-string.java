class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        int n = s2.length();

        if (k > n) return false;
        
        char[] s1Arr = s1.toCharArray();
        Arrays.sort(s1Arr);
        String sorts1 = new String(s1Arr);

        for (int i=0; i<=n-k; i++) {
            String sub = s2.substring(i, i+k);

            char[] subArr = sub.toCharArray();
            Arrays.sort(subArr);
            String sortedsub = new String(subArr);

            if (sorts1.equals(sortedsub)) return true;
        }
        return false;
    }
}