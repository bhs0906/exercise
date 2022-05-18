package baekjoon;

import java.util.Scanner;

public class Q2480___
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
	    if (a == b && b == c) {   // a와 b가 같고 b와 c가 같을것 = a,b,c는 같아야함
	        System.out.println(10000 + a * 1000);
	    }else if (a == b || a == c) { // a와 b가 같거나 a와 c가 같을것
	        System.out.println(1000 + a * 100);
	    }else if (b == c) { 
	        System.out.println(1000 + b * 100);
	    }else {
	    	System.out.println(Math.max(a,Math.max(b, c)) * 100);
	    }
	    	
	}
}