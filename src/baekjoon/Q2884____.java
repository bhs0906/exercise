package baekjoon;

import java.util.Scanner;

public class Q2884____
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h,m;
		
		h = sc.nextInt();
		m = sc.nextInt();
		
		if((m+45)<0) {
			m = (m-15);
			if((h+1) <0) {
				h = 23;
			}else {
				h = h+1;
			}
			
		}else {
            m = m+45;
        }
		
		System.out.println(h+" "+m);
	}
}