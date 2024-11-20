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
