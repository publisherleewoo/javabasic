package ch04;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("단을 입력하세요:");
		int dan = scan.nextInt();
		System.out.println(dan);
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + dan*i );
		}
//		for (int i = 1; i<=9; i++) {
//			System.out.println(i+"단");
//			for (int j = 1; j <=9; j++) {
//				System.out.println(i+"x"+j+"="+j*i);	
//			}
//		}
	}

}
