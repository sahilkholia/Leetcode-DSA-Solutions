package org.example.Pow;

public class Solution {
    public double myPow(double x, int m) {
        long n = m;
        if(n>0){
            return pow(x, n);
        }else if(n<0){
            return (1/pow(x,Math.abs(n)));
        }else{
            return 1;
        }
    }

    double pow(double x, long n){
        if(n == 1){
            return x;
        }
        if(n%2==0){
            return pow(x*x, n/2);
        }else{
            return x * pow(x,n-1);
        }
    }
}
