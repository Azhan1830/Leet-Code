class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int j  = s.length-1;

        while(i < j){
            //swap characters
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            
            i++;
            j--;
        }
    }
}