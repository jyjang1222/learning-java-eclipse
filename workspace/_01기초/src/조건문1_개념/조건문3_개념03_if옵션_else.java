package 조건문1_개념;

public class 조건문3_개념03_if옵션_else {

	public static void main(String[] args) {
		int num = 1;
		if (num % 2 == 0) {
			System.out.println("짝수");
		}
		if (num % 2 == 1) {
			System.out.println("홀수");
		}
		
		System.out.println("---------");
		
		if (num % 2 == 0) {
			System.out.println("짝수");
		} else {
			// if의 조건이 아니면 무조건 실행한다.
			System.out.println("홀수");
		}
	}

}
