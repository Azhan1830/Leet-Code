class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=getnext(n);

        while(fast!=1 && slow!=fast){
            slow=getnext(slow);
            fast=getnext(getnext(fast));
        }
        return fast==1;
    }

    private int getnext(int n){
        int totalsum=0;
        while(n>0){
            int d=n%10;
            totalsum+=d*d;
            n=n/10;
        }
        return totalsum;
    }
}