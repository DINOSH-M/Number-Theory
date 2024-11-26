import java.util.Scanner;

public class PrimeFactorization {
    
    // brute force O(N)
    public static void pf(int n){
        if(n<=1)
        System.out.println(n);

        System.out.print("The prime Factors are : ");
        for(int i = 2;i <=n;i++){
            if(n % i == 0){
                int count = 0;
                while(n % i == 0){
                    count ++;
                    n/=i;
                }
                System.out.print(i +"^" + count +" ");
            }
        } 
    }

    //efficient approach O(sqrt(N))
    // if n is a composite atleast 1 prime factor appear before sqrt(N)
    public static void efficientApproach(int n){
        if(n<=1)
        System.out.println(n);

        System.out.print("The prime Factors are : ");
        for(int i = 2;i*i <=n;i++){
            if(n % i == 0){
                int count = 0;
                while(n % i == 0){
                    count ++;
                    n/=i;
                }
                System.out.print(i +"^" + count +" ");
        }
    }
    // suppose N is a prime number than no prime factors here. 
    if(n > 1)
        System.out.println(n+"^" + 1 +" ");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter How many times you check: ");
        int t = s.nextInt();

        while(t-- > 0){
            System.out.print("Enter the Number : ");
            int n = s.nextInt();
            efficientApproach(n);
        }
        s.close();
    }
}
