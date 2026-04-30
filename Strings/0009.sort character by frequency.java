class Solution {
    public String frequencySort(String s) {
        int []freq=new int[128];
        for(char c:s.toCharArray()){
            freq[c]++;
        }
        Character[]arr=new Character[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i);
        }
        
        Arrays.sort(arr, (a, b) -> {
        if (freq[b] != freq[a]) {
        return freq[b] - freq[a]; // by frequency
         }
        return a - b; // alphabetical order
        });//2,1,1

        StringBuilder ans=new StringBuilder();
        for(char c:arr){
            ans.append(c);
        }
        return ans.toString();
    }
}
