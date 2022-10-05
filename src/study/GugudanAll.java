package study;

public class GugudanAll 
{
	public static void main(String[] args) 
	{
		for (int dan =2; dan<=9 ;dan++ ){
				System.out.printf("***%d단***\n",dan);
			for (int i=1; i<=9;i++ ){
				System.out.printf("%d * %d = %d\n",dan,i,dan*i);
			}
			System.out.println();

		}
	}
}
