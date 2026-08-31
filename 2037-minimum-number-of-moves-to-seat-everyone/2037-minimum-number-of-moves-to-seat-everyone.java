class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int[] diff = new int[101];

        for(int i: seats){
            diff[i]++;
        }
        for(int j: students){
            diff[j]--;
        }

        int moves = 0;
        int unmatched = 0;
        
        for(int k=0; k<100; k++){
            unmatched += diff[k];
            moves += Math.abs(unmatched);
        }
        return moves;
    }
}