ass Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        // code here
        int n=arr.length;
        int sum=0;
        ArrayList<Integer>prefix=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            prefix.add(sum);
        }
        return prefix;
    }
}
