class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            ans.add(a[i]);
        }
            for(int i=0;i<b.length;i++){
            ans.add(b[i]);
        }
        Collections.sort(ans);
        return (ans.get(k-1));
    }
}
