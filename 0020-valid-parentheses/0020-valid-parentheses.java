class Solution {
    public boolean isValid(String s) {
        int length;
        do {
            length = s.length();
            s = s.replace("()", "")
                 .replace("{}", "")
                 .replace("[]", "");
        } while (length != s.length()); // Jab tak length kam ho rahi hai
        
        return s.length() == 0;
    }
}
