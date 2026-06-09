class Solution {
    public int longestConsecutive(int[] nums) {
        //brute force: we get tle
//          if(nums.length==0)return 0;
//          int n=nums.length;
//          int longest=1;
//          for(int i=0;i<nums.length;i++){
//             int x=nums[i];
//             int cnt=1;
//             while(linear(nums,x+1)==true){
//                 x+=1;
//                 cnt+=1;
//             }
//             longest=Math.max(longest,cnt);
//          }
//          return longest;
//     }
//         private boolean linear(int[]a,int num){
//            int n=a.length;
//            for(int i=0;i<n;i++){
//             if(a[i]==num) return true;
//            }
//            return false;
//         }
// }
//                 better solution
//               int n=nums.length;
//               if(n==0)return 0;
//               Arrays.sort(nums);
//               int lastsmall=Integer.MIN_VALUE;
//               int cnt=0;
//               int longest=1;
//               for(int i=0;i<n;i++){
//                 if(nums[i]-1==lastsmall){
//                     cnt+=1;
//                     lastsmall=nums[i];
//                 }
//                 else if(nums[i]!=lastsmall){
//                     cnt=1;
//                     lastsmall=nums[i];
//                 }
//                 longest=Math.max(longest,cnt);
//               }
//               return longest;
//     }
// }
//optimal
int n=nums.length;
if (n==0)return 0;
int longest=1;
HashSet<Integer>set=new HashSet<>();
for(int i=0;i<nums.length;i++){
    set.add(nums[i]);
}
for (int num:set){
      if(!set.contains(num-1)){
        int count=1;
        int x=num;
        while(set.contains(x+1)){
            x=x+1;
            count=count+1;
        }
        longest=Math.max(longest,count);
      }
}
return longest;
}
}    
      
