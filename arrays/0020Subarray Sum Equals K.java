class Solution {
    public int subarraySum(int[] nums, int k) {
int count=0,sum=0;
HashMap<Integer,Integer>ans=new HashMap<>();
for(int i=0;i<nums.length;i++){
    sum+=nums[i];
    if(sum==k){
        count++;
    }
    if(ans.containsKey(sum-k)){
    count+=ans.get(sum-k);
    }
    ans.put(sum,ans.getOrDefault(sum,0)+1);
}
return count;
    }
}
