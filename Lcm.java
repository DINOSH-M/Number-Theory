import java.util.Scanner;

public class Lcm {
     // gcd(a,b) * lcm(a,b) = a * b => lcm(a,b) = a * b / gcd(a,b)

     public static int findGcd(int a, int b){
        if(a == 0)
        return b;

        return findGcd(b % a , a);
     }

     public static int lcm(int a , int b){
        int gcd = findGcd(a, b);

        int lcm = (a * b ) / gcd ;

        return lcm;
     }

     public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.print("Enter A : ");
        int a = s.nextInt();
        System.out.print("Enter B : ");
        int b = s.nextInt();

        System.out.println("LCM : "+ lcm(a, b));
        s.close();
     }
}
