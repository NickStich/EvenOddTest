package main.java;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static boolean isprime(int n) {
        for (int i=2;i<=n/2;i++){
            if (n%i==0)
                return false;
        }
        return true;
    }
    public static List<Integer> firstPrime(int n){
        int x=0;
        List<Integer>numb=new ArrayList<>();
        for (int i=1;i<=n;i++)
        if (isprime(i)) {
            numb.add(i);
            x++;
            if (x == 10) {
                break;
            }
        }
        return numb;
    }
    public static void main(String[] args) {

        System.out.println(firstPrime(100));
    }
}
