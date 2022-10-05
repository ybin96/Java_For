package practice;

import java.util.Scanner;
class Exam02 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,cnt=0;
		System.out.print("임의의 수를 입력하시오 :");
		n = sc.nextInt();

		for (int i=1;i<=n ;i++ ){
			if (n%i ==0){
				cnt++;
			}
		}
		if (cnt == 2)
			System.out.println(n+"은 소수입니다.");
		else
			System.out.println(n+"은 소수가 아닙니다.");
	}
}
