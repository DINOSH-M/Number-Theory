// A happy number is a number that, when you repeatedly sum the squares of its digits,
// eventually reaches 1. If it does not reach 1 and instead falls into a cycle of numbers, 
//it is considered unhappy or sad.

//EX : n = 7 -> 7^2 = 49 
//-> 4^2 + 9^2 = 16 + 81 = 97 
//-> 9^2 + 7^2 = 81 + 49 = 130 
//-> 1^2 + 3^2 + 0^2 = 1 + 9 + 0 = 10 
//-> 1^2 + 0 ^2 = 1

// suppose there exist any repeated element n then it is not a happy number.


package com.numberTheory;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {
	public static int sumOfSquare(int n) {
		int sum = 0,digit;
		while(n>0) {
			digit = n%10;
			sum += digit * digit;
			n/=10;
		}
		return sum;
	}
	public static boolean isHappyNumbers(int n) {
		Set<Integer> h = new HashSet<Integer>();
		while(n!=1) {
		    if(h.contains(n))
		    	return false;
		    h.add(n); 5l8u
		    
		    n = sumOfSquare(n);
		}
		return true;
		
	}
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int t = sc.nextInt();
		 while(t>0) {
			 int n = sc.nextInt();
			 if(isHappyNumbers(n)) {
				 System.out.println("it is happy number");
			 }
			 else {
				 System.out.println("it is unhappy");
			 }
		 }
		
	 }
}
