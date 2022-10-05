package study;

public class ContinueTest 
{
	public static void main(String[] args) 
	{
		int i;
		for (i=1;i<=10;i++){
			if (i%3==0){
				continue; // 조건을 뛰어남는다고 생각, 3의배수는 제외하고 출력됌
			}
			System.out.println(i);
		}
		System.out.println("작업종료");
		System.out.println("i:"+i);
	}
}
