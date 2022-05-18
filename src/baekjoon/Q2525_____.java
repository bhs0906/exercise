package baekjoon;

import java.util.Scanner;

public class Q2525_____
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int hour = input.nextInt();
		int min = input.nextInt();
		int cook = input.nextInt();
		int result = min + cook;
		
		//요리시간이 60분 넘었을 때
		if(result >= 60) {
			//시간이 24시가 넘었을 때
			if((hour + result / 60) >= 24)
				System.out.println((hour + result / 60) % 24 + " " +(result % 60));
			else
				System.out.println((hour + result / 60) + " "+(result % 60));
		}
		else
			System.out.println(hour +" "+(min + cook));
		input.close();
	}
}
	
	