package ch04;

public class Test2 {

	public static void main(String[] args) {
		int num = 5;
		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum = sum + i;
		}
		System.out.println("1~" + num + "까지의 합계 :"+sum);
	}

}
