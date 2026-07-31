class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;        // Total rows
        int n = matrix[0].length;     // Total columns
        
        int low = 0;
        int high = m * n - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // 1D mid index ko 2D (row, col) me convert kar rahe hain
            int row = mid / n;
            int col = mid % n;
            
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return false;
    }
}