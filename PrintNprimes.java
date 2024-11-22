
import java.util.Arrays;
import java.util.Scanner;

public class PrintNprimes{
    public static boolean[] isPrime;
   
   //Algorithm :
   // Sieve of Eratosthenes : 

    public static boolean[] printNprimes(int n){
        int m = n+1;
        isPrime = new boolean[m];
        Arrays.fill(isPrime,true);

        isPrime[0] = isPrime[1] = false;

        for(int i = 2 ; i * i <= m ; i++ ){
            if(isPrime[i]){
                for(int j = i*i; j< m ; j+=i){
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }

    public static void show(boolean[] arr){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == true)
            System.out.print( i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter How Many times to print n prime Numbers : " );
          int t = sc.nextInt();

        while(t>0){
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

        boolean[] prime = printNprimes(n);
        show(prime);
       t--;
        }

        sc.close();
    }

}
