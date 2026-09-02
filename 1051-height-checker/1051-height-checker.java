class Solution {
    public int heightChecker(int[] heights) {
        int[] arr = new int[101]; // frequrncy array

        for(int i: heights){
            arr[i]++;
        }
        int count = 0;
        int curr_hei = 1;

        for(int i=0; i<heights.length; i++){
            while(arr[curr_hei] == 0){
                curr_hei++;
            }
            if(heights[i] != curr_hei){
                count++;
            }
            arr[curr_hei]--;
        }
        return count;
    }
}