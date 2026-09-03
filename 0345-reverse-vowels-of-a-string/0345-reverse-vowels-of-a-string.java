class Solution {
    public String reverseVowels(String s) {
        /*  1. Make a function for checking vowel
            2. Converting s to array
            3. Applying two pointer
            4. returning the array
        */

        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            if(!isVowel(arr[left])){
                left++;
            }
            else if(!isVowel(arr[right])){
                right--;
            }
            else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
        return new String(arr);
    }
    private boolean isVowel(char v){
        return v=='a'||v=='e'||v=='i'||v=='o'||v=='u'||v=='A'||v=='E'||v=='I'||v=='O'||v=='U';
    }
}