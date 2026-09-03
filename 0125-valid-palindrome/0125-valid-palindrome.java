class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        while(left < right){
            char cl = s.charAt(left); // cl = current left
            char cr = s.charAt(right); // cr = current right

            if(!Character.isLetterOrDigit(cl)){
                left++;
            }
            else if(!Character.isLetterOrDigit(cr)){
                right--;
            }
            else{
                if(Character.toLowerCase(cl) != Character.toLowerCase(cr)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}