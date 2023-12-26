package 조건문1_개념;
/*
# 조건문 if
	1. if 		: 키워드
	2. (조건식) 	: 조건이 사실인지 판별한다.
	3. {기능}	: 위 조건을 기반으로 기능을 실행한다.
	-----------------------------------------
	4. 구조
		if(조건식) {
			조건식이 참(true)일 때 실행할 문장;
		}
*/
public class 조건문1_개념01_조건문 {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
		if (a == b) {
			System.out.println("O");
		}
		if (a != b) {
			System.out.println("X");
		}
	}
}