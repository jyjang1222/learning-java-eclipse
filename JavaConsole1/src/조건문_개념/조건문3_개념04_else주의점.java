package 조건문_개념;

public class 조건문3_개념04_else주의점 {
/*
	# else 사용 시 주의할 점
	- else는 바로 위의 if와 연결되기 때문에
	  조건이 여러개인 경우 올바르게 작동하지 않는다.
*/
	public static void main(String[] args) {
		// 아래는 오류를 발생시킨다.
		System.out.println(">>> 자판기 <<<");
		System.out.println("[1.과자 2.음료수 3.라면]");
		
		System.out.println("번호를 입력하세요 : 1");
		int select = 1;
		
		if (select == 1) { System.out.println("1.과자"); }
		if (select == 2) { System.out.println("2.음료수"); }
		if (select == 3) { System.out.println("3.라면"); }
		else { System.out.println("오류"); }
		
		System.out.println("-------------------------------");
		
		System.out.println(">>> 자판기 <<<");
		System.out.println("[1.과자 2.음료수 3.라면]");
		
		System.out.println("번호를 입력하세요 : 1");
		select = 1;
		
		if (select == 1) { System.out.println("1.과자"); }
		if (select == 2) { System.out.println("2.음료수"); }
		if (select == 3) { System.out.println("3.라면"); }
		if (3 < select || select < 1) { System.out.println("오류"); }
	}

}
