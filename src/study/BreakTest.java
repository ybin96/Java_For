package study;

public class BreakTest 
{
	public static void main(String[] args) 
	{
		int i;
		for (i=1;i<=10;i++){
			System.out.println(i);
			if (i%3==0){
				break; // for문을 탈출한다. if문이나 switch문을 탈출한다.
			}
		}
		System.out.println("작업종료");
		System.out.println("i:"+i);
	}
}
