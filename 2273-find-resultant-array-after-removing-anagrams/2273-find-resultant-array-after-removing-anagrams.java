class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        for(String i : words){
            list.add(i);
        }

        int i = 1;
        while(i < list.size()){
            if(isAnnagram(list.get(i), list.get(i-1))){
                list.remove(i);
            }
            else{
                i++;
            }
        }
        return list;
    }
    private boolean isAnnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        char[] s_char = s.toCharArray();
        char[] t_char = t.toCharArray();

        Arrays.sort(s_char);
        Arrays.sort(t_char);

        return (Arrays.equals(s_char, t_char));
    }
}