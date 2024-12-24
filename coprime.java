// coprime : if a given two numbers A and B is said to be a coprime or mutually prime numbers it follow a condition
//           if -> GCD(A,B) = 1 -> A and B are coprime.
//           else -> A and B are not a prime number.

import java.util.Scanner;

public class coprime {

    //using recursion:
    public static int gcd(int a , int b){
        if(a == 0)
        return b;

        return gcd(b%a , a);
    }

    public static void isCoprime(int a , int b){
        if(gcd(a, b) == 1)
        System.out.println("the given "+a+" and "+b+" are coprime");
        else
        System.out.println("the given "+a+" and "+b+" are Not coprime");
    }

    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         System.out.print("Enter A : ");
         int a = s.nextInt();
        System.out.print("Enter B : ");
        int b = s.nextInt();

        isCoprime(a, b);
        s.close();
    }
}
