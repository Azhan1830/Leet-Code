class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int left = 0;
        int right = n-1;

        while(left<=right){
            int mid = left + (right-left)/2;
            int a = n-mid; // a = remaining papers

            if (citations[mid]==a){
                return a;
            }
            else if (citations[mid] < a){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return n - left;
    }
}