//brute 
class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // code here
      String binary=Integer.toBinaryString(n);
      if(k>=binary.length())return false;
      return binary.charAt(binary.length()-k-1)=='1';
    }
}
//optimal

class CheckBit {
    static boolean checkKthBit(int n, int k) {
    return (n&(1<<k))!=0;
    }
}

class CheckBit {
    static boolean checkKthBit(int n, int k) {
   return((n>>k)&1)==1;
    }
}
