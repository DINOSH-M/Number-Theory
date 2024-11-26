package Number-Theory

import java.util.Scanner;

public class sumOfNaturalNumbers {

    //brute force : TC : O(N)
    public static int bruteForce(int n){
        int sum = 0;
        for(int i = 1 ; i <= n; i++){
            sum = sum + i;
        }
        return sum;
    }

    //using formula: TC : O(1)
    public static int efficient(int n){
        n = n * (n + 1) / 2;
        return n;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int n = s.nextInt();

        int result = bruteForce(n);
        System.out.println("the result is : "+ result);
        s.close();
    }
}
