class Solution {
    public int binaryToDecimal(String b) {
        // code here
        int n=b.length();
        int p2=1,num=0;
        for(int i=n-1;i>=0;i--){
            if(b.charAt(i)=='1')
            num=num+p2;
            p2=p2*2;
    }
        return num;
    }
}
