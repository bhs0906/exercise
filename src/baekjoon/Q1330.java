package baekjoon;

import java.util.Scanner;

public class Q1330
{

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	if(a>b) {
		System.out.println(">");
	} else if(a<b) {
		System.out.println("<");
	} else
		System.out.println("==");
	}

}


//첫째 줄에 다음 세 가지 중 하나를 출력한다.
//
//A가 B보다 큰 경우에는 '>'를 출력한다.
//A가 B보다 작은 경우에는 '<'를 출력한다.
//A와 B가 같은 경우에는 '=='를 출력한다.
