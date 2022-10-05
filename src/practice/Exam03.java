package practice;

import java.util.Scanner;
public class Exam03
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int isum=0, jsum=0;

		for (int i=10; i<=30 ;i++){
				isum += i;
			}
		System.out.println("i의 계산값은 :"+isum);

		for (int j=0; j<=5 ;j++){
				jsum += j;
			}
		System.out.println("j의 계산값은 :"+jsum);
		
		System.out.println("i * j = "+isum*jsum);
	}
}
