class Solution {
    public boolean isPowerOfThree(int n) {
        long threemaxpow=(long)(Math.pow(3,31));
        if(n>0 && threemaxpow % n==0)
        return true;
        else 
        return false;
    }
}
