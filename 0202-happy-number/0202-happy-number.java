class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> a = new HashSet<>();
        while(n != 1){
            if(a.contains(n)){
                return false;
            }
            a.add(n);
            n = getnext(n);
        }
        return true;
    }
    
    private int getnext(int n){
        int totalsum = 0;
        while(n>0){
            int digit = n%10;
            totalsum += digit*digit;
            n = n/10;
        }
        return totalsum;
    }
}