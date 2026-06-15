https://www.geeksforgeeks.org/problems/activity-selection-1587115620/1?utm_source=chatgpt.com

class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here
        int n=start.length;
        List<int[]>meetings=new ArrayList<>();
        for(int i=0;i<n;i++){
            meetings.add(new int[]{finish[i],start[i]});
        }
        meetings.sort((a,b)-> Integer.compare(a[0], b[0]));
        int count=0;
        int lastend=-1;
        for(int[] meeting:meetings){
            if(meeting[1]>lastend){
                count++;
                lastend=meeting[0];
            }
        }
        return count;
    }
}
