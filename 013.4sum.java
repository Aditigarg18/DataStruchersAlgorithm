class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
//       int n=nums.length;
//         Set<List<Integer>> ans = new HashSet<>();
//         Arrays.sort(nums);
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 for(int k=j+1;k<n;k++){
//                     for(int l=k+1;l<n;l++){
//              long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];

// if (sum == target) {
//       ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
//                       }
//                     }
//                 }
//             }
//         }
//       return new ArrayList<>(ans);
//     }
// }

          int n=nums.length;
  Set<List<Integer>> ans = new HashSet<>();
     Arrays.sort(nums);
        for(int i=0;i<n-3;i++){
            if(i>0&&nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<n-2;j++){
                   if(j>i+1&&nums[j]==nums[j-1]) continue;
            int k=j+1;
            int l=n-1;
            while(k<l){
        long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
            if(sum==target){
        ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                //skip duplicates
            while(k<l&&nums[k]==nums[k+1]) k++;
            while(k<l&&nums[l]==nums[l-1]) l--;
            k++;
            l--;
            }
        else if(sum<target){
             k++;
            }
            else { 
                l--;
        }
            }
        }
        }
        return new ArrayList<>(ans);
    }
};

