class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code her
        ArrayList<Integer>ans=new ArrayList<>();
        int n=arr.length;
        long s1=(long)n*(n+1)/2;
      long sn=(long)n*(n+1)*(2*n+1)/6;
        long S1=0;
        long Sn=0;
        for(int i=0;i<arr.length;i++){
             S1+=arr[i];
             Sn+=(long)arr[i]*arr[i];
        }
        long val1=s1-S1;
        long val2=sn-Sn;
        val2=val2/val1;
        long missing=(val1+val2)/2;
        long repeating=missing-val1;
        ans.add((int)repeating);
        ans.add((int)missing);
        return ans;
    }
}
