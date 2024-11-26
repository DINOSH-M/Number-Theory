import java.util.Arrays;
import java.util.Scanner;

public class MersennePrimeNumbers {
    //if a prime numner is said to be Mersenne prime numbers it could exist in the form of 2^N - 1,where 
    // N is a natural numbers where N = 2,3.....inf

    //Ex : 2^2 - 1 = 4-1 = 3 -> 3 is a prime so it exists in the form 2^N-1.so 3 is a MPN
    //     2^4 - 1 = 16-1 = 15 -> 15 is not a prime so it is Not a MPN

    public static void seiveOfErothenes(int n , boolean[] prime){
            
         Arrays.fill(prime, true);
         prime[0] = prime[1] = false;

         for(int i =2 ; i*i<=n;i++){
            if(prime[i]){
                for(int j = i*i;j<=n;j+=i)
                    prime[j] = false;
                
            }
         }
    }

    public static void mersenne(int n){
         boolean[] prime = new boolean [n+1];
         seiveOfErothenes(n, prime);
         System.out.print("The Mersenne Primes are : ");
         for(int i = 2 ; (1 << i) - 1 <= n;i++){
            long num = (1<<i )- 1;

            if(prime[(int) num]){
                System.out.print(num + " ");
            }
         }
         System.out.println();
    }

    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        System.out.print("Enter How many times you check: ");
        int t = s.nextInt();

        while(t-- > 0){
            System.out.print("Enter the Number : ");
            int n = s.nextInt();
            mersenne(n);
        }
        s.close();
    
    }
}
