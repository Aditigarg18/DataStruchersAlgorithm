class Solution {
    public int findMin(int n) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        int demo[]={1,2,5,10};
        int x=demo.length;
        int count=0;
        for(int i=x-1;i>=0;i--){
            while(n>=demo[i]){
            n=n-demo[i];
            ans.add(demo[i]);
            count++;
        }
        }
        return count;
    }
}
