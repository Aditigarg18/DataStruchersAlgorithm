class Solution {
    public boolean checkIfPangram(String sentence) {
      HashSet<Character>set=new HashSet<>();
      char[]arr=sentence.toCharArray();
        for(int i=0;i<sentence.length();i++){
            set.add(arr[i]);
        }
        return set.size()==26;
    }
}
