package study;

import java.util.Scanner;
public class ExamLast
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		int sum=0,cnt=0;
		System.out.print("N을 입력하시오 :");
		n = sc.nextInt();
		
		for (int i=1;i<=n;i++)
		{
			if (i%3==0)
			{
				sum = sum+i; // sum +=i
				cnt = cnt+1; // cnt++
			}
		}
		System.out.printf("1에서 %d까지의 3의배수의 합 : %d\n",n,sum);
		System.out.printf("1에서 %d까지의 3의배수의 합 : %d\n",n,cnt);
	}
}
