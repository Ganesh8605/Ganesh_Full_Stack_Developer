class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<0)
        n=(-1)*n;
        long power=(long)(Math.pow(4,31));
        if(n==1)
        return true;
        n=n*4;
        if(n>0 && power % n==0)
        return true;
        else
        return false;
    }
}
