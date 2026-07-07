class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int j=1;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[j-1]){
              nums[j]=nums[i];
              j++;
            }
        }
        return j;
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
            HashSet<Integer>st=new HashSet<>();
            int index=0;
            for(int num:nums){
                if(!st.contains(num)){
                    st.add(num);
                    nums[index]=num;
                    index++;
                }
            }
            return index;
    }
}
