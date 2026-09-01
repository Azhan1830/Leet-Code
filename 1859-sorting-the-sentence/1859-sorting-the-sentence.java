class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        int n = words.length;

        // Apply bubble sort
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                char n1 = words[j].charAt(words[j].length()-1);
                char n2 = words[j+1].charAt(words[j+1].length()-1);

                if(n1 > n2){
                    String temp = words[j];
                    words[j] = words[j+1];
                    words[j+1] = temp;
                }
            }
        }
        // Removing digit from sentence
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<n; i++){
            ans.append(words[i].substring(0,words[i].length()-1));
            if(i < n-1){
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}