package 기본이론1_개념;

public class 기본이론8_문자와숫자출력 {
	public static void main(String[] args) {
	/*
		더하기 : +
		(1) 덧셈 : 숫자 + 숫자 => 숫자
		(2) 연결 
				문자 + 숫자 => 문자
				숫자 + 문자 => 문자
				문자 + 문자 => 문자
				
	*/
		// 2. 연결 연산자
		//	1) "문자" + "문자" = "문자"
		System.out.println("안녕" + "하세요");
		//	2) 숫자 + "문자" = "문자"
		System.out.println(10 + "3");
		//	3) "문자" + 숫자 = "문자"
		System.out.println("10" + 3);
		System.out.println("------------------------");
		System.out.println("덧셈 = " + 10 + 3);
		System.out.println("나누기(몫) = " + 10 / 3);
		System.out.println("나누기(소수점) = " + 10.0 / 3);
	}
}
