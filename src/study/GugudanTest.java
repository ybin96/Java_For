package study;

import java.util.Scanner;
public class GugudanTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int a;
		System.out.println("구구단중 몇단을 출력할까요 ? ");
		a = sc.nextInt();

		for (int i=1;i<=9;i++)
		{
			//System.out.println(a+"*"+i+"="+(a*i));
			System.out.printf("%d * %d = %d\n",a,i,a*i);
		}
	}
}
