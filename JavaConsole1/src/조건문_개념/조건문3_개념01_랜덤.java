package 조건문_개념;

import java.util.Random;

public class 조건문3_개념01_랜덤 {

	public static void main(String[] args) {
		Random ran = new Random();
		// 예) 0 ~ 2 사이의 랜덤
		int rNum = ran.nextInt(3);
		System.out.println(rNum);
		// 문제1) 1 ~ 5 사이의 랜덤
		rNum = ran.nextInt(5) + 1;
		System.out.println(rNum);
		// 문제2) -3 ~ 3 사이의 랜덤
		rNum = ran.nextInt(7) - 3;
		System.out.println(rNum);
		// 문제3) 150 ~ 250 사이의 랜덤
		rNum = ran.nextInt(101) + 150;
		System.out.println(rNum);
	}

}
