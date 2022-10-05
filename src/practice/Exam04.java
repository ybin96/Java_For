package practice;

import java.util.Scanner;
public class Exam04 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		long a = 0, b=1, c;
		int i,n;

		System.out.print("몇항까지 출력할까요? ");
		n = sc.nextInt();

		System.out.print("0 ");
		System.out.print("1 ");
		for (i=2;i<=n;i++){
			c = a+b;
			a=b;
			b=c;
			System.out.print(c+ " ");
		}
	}
}
