class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        /*
        1. ek hashmap bnao isme num1 ki frequency store krle
        2. fir ek  bnao aur nums2 ke liye loop chlaao aur check kro ki us freq>0 hai if yes toh usse res array me dal do aur freq decrease krdo 
        3. res array return krdo
        */
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums1){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for(int i: nums2){
            if(map.containsKey(i) && map.get(i) > 0){
                list.add(i);
                map.put(i, map.get(i) - 1);
            }
        }
        int[] res = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
}