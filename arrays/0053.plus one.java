class Solution {
    public int[] plusOne(int[] digits) {
   int n=digits.size();
   int i=n-1;
   while(i>=0){
    if(digits[i]<9){
        digits[i]+=1;
        return digits;
   }
   digits[i]=0;
   i--;
    }
    }
}
