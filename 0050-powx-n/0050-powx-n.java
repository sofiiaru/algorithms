class Solution {
    public double myPow(double x, int n) {
        long exp = (long)n;
        if(exp == 0) return 1;
        if(exp == 1) return x;

        if(exp < 0) {
            x = 1/x;
            exp = -exp; 
        }       
        return (exp % 2 == 0)? myPow(x*x, (int)(exp/2)) : myPow(x*x, (int)(exp/2)) * x ;                
    }
}