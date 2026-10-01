class Solution {
    public int reverseDegree(String s) {
        int totaldegree = 0;
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            int revVal = 26 - (ch - 'a');
            int pos = i + 1;
            totaldegree += (revVal * pos);
        }
        return totaldegree;   
    }
}