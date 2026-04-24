class Solution {
    public String reverseWords(String s) {
        s = s.trim();   // remove leading/trailing spaces
        
        String[] words = s.split("\\s+");  
        // \\s+ means one or more spaces
        
        StringBuilder ans = new StringBuilder();
        
        for(int i = words.length - 1; i >= 0; i--) {
            ans.append(words[i]);
            
            if(i != 0) {
                ans.append(" ");
            }
        }
        
        return ans.toString();
    }
}
