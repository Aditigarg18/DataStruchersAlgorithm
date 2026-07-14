class Solution {
    static int setKthBit(int n, int k) {
        // code here
        String binary=Integer.toBinaryString(n);
        StringBuilder sb=new StringBuilder(binary);
        sb.reverse();
        while(sb.length()<=k){
            sb.append('0');
        }
        sb.setCharAt(k,'1');
        sb.reverse();
        return Integer.parseInt(sb.toString(),2);
    }
}
class Solution {
    static int setKthBit(int n, int k) {
        return n|(1<<k);
    }
}
