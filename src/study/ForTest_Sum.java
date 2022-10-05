package study;

import java.util.Scanner;
public class ForTest_Sum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int a,sum=0,i;
		
		System.out.print("1부터 어디까지 더할까요? ");
		a = sc.nextInt();
		
		for (i=1 ;i<=a ; i++)
		{
			sum +=i; // sum = sum+i
		}
		System.out.printf("1부터 %d까지의 합은 %d입니다.\n",a,sum);
		System.out.printf("i:"+i); // for 조건을 만족하지 않을때 탈출
	}
}
