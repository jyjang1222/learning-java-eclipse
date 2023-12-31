package 기본이론_개념;

public class 기본이론7_서식문자 {
	public static void main(String[] args) {
		/*
		출력문의 종류
		1. println()
		2. print()
		---------------------
		3. printf()
			1) f = format(서식)
			2) 서식 문자의 종류 (어떤 형식으로 출력할지 결정)
				%알파벳
				%d		decimal,정수
				%f		float,실수
				%c		character,문자한개
				%s		String,문자여러개
		*/
		System.out.println(10);
		System.out.printf("%d", 10);
		System.out.println();
		
		System.out.println(3.14123123123);
		System.out.printf("%.2f", 3.14123123123);
		System.out.println();
		System.out.printf("%.0f%%", 3.14123123123);
		// 문자열 포맷 코드인 %d와 %가 같은 문자열 안에 있을 때 특수 문자인 %를 나타내려면 반드시 %%로 써야 한다
		System.out.println();
		
		System.out.println('A');
		System.out.printf("%c", 'A');
		System.out.println();
		
		System.out.println("A형");
		System.out.printf("%s", "A형");
		System.out.println();
		
		System.out.println(10 + " + " + 3 + " = " + 13);   
		System.out.printf("%d + %d = %d", 10, 3, 13);   
		
	}
}
