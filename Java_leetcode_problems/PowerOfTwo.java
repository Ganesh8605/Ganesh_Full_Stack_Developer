class Solution {
    public boolean isPowerOfTwo(int n) {
        long maxpower=(long)(Math.pow(2,31));
       if(n>0 && maxpower%n==0)
       return true;
       else
       return false;
    }
}
