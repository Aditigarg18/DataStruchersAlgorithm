class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        int max=0;
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                ans.add(arr[i]);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
 
