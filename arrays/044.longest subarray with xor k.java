class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here

        HashMap<Integer,Integer>mp=new HashMap<>();
        int prexor=0,count=0;
        for(int i=0;i<arr.length;i++){
            prexor^=arr[i];
            if(prexor==k){
                count++;
            }
            if(mp.containsKey(prexor^k)){
                count+=mp.get(prexor^k);
            }
            mp.put(prexor,mp.getOrDefault(prexor,0)+1);
        }
        return count;
    }
}
