class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        /*
        1. Har row ke liye binary search use krege
        2. if target mil gya toh return true else false
        */
        int m =matrix.length;
        for(int i=0; i<m; i++){
            if(binarySearch(matrix[i], target)){
                return true;
            }
        }
        return false;
    }
    private boolean binarySearch(int[] row, int target){
        int low = 0;
        int high = row.length - 1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if(row[mid] == target){
                return true;
            }
            else if(row[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return false;
    }
}