class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
         for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target)
                    return new int[]{i,j};
            }
         }
return new int []{};

    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // brute
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                   arr[0]=i;
                   arr[1]=j;
            }
        }
        }
        return arr;
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>ans=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int temp=target-nums[i];
            if(ans.containsKey(temp)){
            return new int[]{ans.get(temp),i};
            }
               ans.put(nums[i],i);
        }
        return new int[]{};
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
       int n=nums.length;
    int [][]arr=new int[n][2];
    for(int i=0;i<n;i++){
        arr[i][0]=nums[i];
        arr[i][1]=i;
    }
    Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
    int l=0;
       int r=nums.length-1;
       while(l<r){
        int sum=arr[l][0]+arr[r][0];
        if(sum==target) {
            return new int[]{arr[l][1],arr[r][1]};
        }
        else if(sum>target)
        r--;
        else l++;
       }
       return new int[]{};
    }
}
