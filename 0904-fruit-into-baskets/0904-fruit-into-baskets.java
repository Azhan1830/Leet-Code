class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int max_len = 0;
        int left = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int right=0; right<n; right++){
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            while(map.size() > 2){
                map.put(fruits[left], map.get(fruits[left]) - 1);

                if (map.get(fruits[left]) == 0){
                    map.remove(fruits[left]);
                }
                left++;
            }
            max_len = Math.max(max_len, right-left+1);
        }
        return max_len;
    }
}