package com.practice.ds.numbers;
public class NumberUtil {

    static int getCountOfDigits(int n){
        if (n==0){
            return 1;
        }
        if (n<0){
            n=-1*n;
        }
        int count=0;
        while (n>0){
            n=n/10;
            count++;
        }
        return count;
    }

    static int reverseDigits(int n){
        int rev=0,digit;
        if (n<0)
            n=-1*n;
        while (n>0){
            digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        return rev;
    }

    public static boolean checkPalendromNumber(int n){
        if (n<0)
            n=-1*n;
        return n==reverseDigits(n);
    }

    public static int factorial(int n){
        if (n<0){
            n=-1*n;
        }
        int fact=1;
        for (int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

}
