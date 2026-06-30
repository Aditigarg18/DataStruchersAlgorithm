class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<int[]>pq=new PriorityQueue<>(
            (a,b)->a[0]-b[0]
        );
        for (Map.Entry<Integer,Integer>entry:map.entrySet()){
            int element=entry.getKey();
            int freq=entry.getValue();
            pq.offer(new int[]{freq,element});
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] ans=new int[k];
        int i=0;
        while(!pq.isEmpty()){
            ans[i++]=pq.poll()[1];
        }
        return ans;
    }
}
