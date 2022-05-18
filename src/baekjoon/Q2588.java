package baekjoon;

import java.util.Scanner;

public class Q2588
{

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	int B = sc.nextInt();
	
	System.out.println(A*(B%10));
	System.out.println(A*((B/10)%10));
	System.out.println(A*(B/100));
	System.out.println(A*B);
	}

}



//숫자를 수학적으로 접근하여 푸는 방법이다.
//
//
//
//이 문제의 포인트는 B에 들어오는 입력값을 각 자릿수 별로 얻어오는 것이다.
//
//그럼 두번째 입력으로 들어오는 385 의 각 자릿수 값을 어떻게 구할까?
//
// 
//
//일의 자리 5의 경우 385 % 10 을 해주면 10으로 나눠준 값의 나머지를 구하니 5가 반환이 될 것이다.
//
// 
//
//십의자리 8은 385%100 을 해주면 85 가 나오고 이걸 10으로 나누면, 즉 85/10 을 하면 8이 반환 될 것이다.
//
//백의자리 3은 385/100 을 하면 3이 나온다.