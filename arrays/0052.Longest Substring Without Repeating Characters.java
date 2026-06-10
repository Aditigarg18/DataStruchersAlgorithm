class Solution {
    public int lengthOfLongestSubstring(String s) {
      //brute
    //   int n=s.length();
    //   int maxi=0;
    //   for(int i=0;i<s.length();i++){
    //     int hash[]=new int[256];
    //     Arrays.fill(hash,0);
    //     for(int j=i;j<n;j++){
    //         if(hash[s.charAt(j)]==1)break;
    //         hash[s.charAt(j)]=1;
    //         int len=j-i+1;
    //         maxi=Math.max(maxi,len);
    //     }
    //   }  
    //        return maxi;
    //optimal
    HashMap<Character,Integer>mpp=new HashMap<>();
    int left=0,right=0,len=0;
    int n=s.length();
    while(right<n){
        if(mpp.containsKey(s.charAt(right))){
            left=Math.max(mpp.get(s.charAt(right))+1,left);
        }
        mpp.put(s.charAt(right),right);
        len=Math.max(right-left+1,len);
        right++;
    }
    return len;
    }
}
