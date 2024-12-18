// FInd a Gcd of Two Numbers:

import java.util.Scanner;

class gcd{

    //BruteForce TC : O(min(a,b))
    public static int findGcd(int a , int b){

        int result = Math.min(a,b);

        while(result > 0){ 

            if( a % result == 0 && b % result == 0)
            break;

            result--;
        }
        return result;

    } 

    //use Euclids Algorithm TC : O(log N )

    public static int euclid(int a , int b){

        a = Math.abs(a);
        b = Math.abs(b);

        if(a == 0 && b == 0)
        return 0;

         if(a == 0)
         return b;

         if(b == 0)
         return a;
      
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;        
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A : ");
        int a = sc.nextInt();

        System.out.print("Enter B : ");
        int b = sc.nextInt();

        System.out.println("The GCD of "+a+" AND "+b+" is : "+ euclid(a,b));
    }
}