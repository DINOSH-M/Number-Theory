//package Number-Theory

import java.util.Scanner;

public class PrimeNumber {

    //brute force :
    public static boolean isPrime(int n){
            if(n == 1)
            return false;
        for(int i = 2 ; i <= n; i++){
            if(n%i == 0)
             return false;
        }
        return true;
    }

    //using Efficient Method : O(sqrt(N)):
    public static boolean efficientPrime(int n){
       if(n == 1)
        return false;
        for(int i = 2 ; i*i <= n; i++){
            if( n%i == 0)
             return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        System.out.print("Enter How many times you want to check : ");
        int t = s.nextInt();

        while(t>0){
        System.out.print("Enter the Number : ");
        int n = s.nextInt();

        if(efficientPrime(n))
        System.out.println(n +" is a Prime Number..");
        else
        System.out.println(n +" is Not a Prime Number..");

       t--;
        }

        s.close();
    }
}
