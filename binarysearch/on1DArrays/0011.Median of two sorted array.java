class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int n=n1+n2;
        ArrayList<Integer>ans=new ArrayList<>();
        int i=0,j=0;
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                ans.add(nums1[i++]);
            }
            else{
                ans.add(nums2[j++]);
            }
        }
        while(i<n1) ans.add(nums1[i++]);
        while(j<n2) ans.add(nums2[j++]);
        if(n%2==1) return ans.get(n/2);
        else return (double) ((double)ans.get(n/2)+(double)ans.get(n/2-1))/2.0;
    }
}
