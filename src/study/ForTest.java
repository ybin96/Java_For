package study;

import java.util.Scanner;
class ForTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int n,result=1;
		System.out.print("N을 입력하시오 :");
		n = sc.nextInt();
		
		for (int i=n;i>=1;i--)
		{
			result = result * i;
			System.out.print(i);
			if(i>1)
				System.out.print("*");
		}
		System.out.println("=" +result);
		
	}
}
