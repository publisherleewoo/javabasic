package ch09;

public class Array {

	public static void main(String[] args) {
		int[] numbers = new int[3];
		//int 타입의 배열을 numbers라는 변수에 담는다
		// new int[3];  3개의 배열;
		// numbers라는 변수에 3개의 원소가 있다.
		
		numbers[0]=4;
		numbers[1]=10;
		numbers[2]=20;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
//		123number[3]=30 //컴파일에러
//		numbers[3]=20;
//		// 갯수 초과
//		// Exception == runTime Error
		
		String[] inventory = new String[2];
		inventory[0]="가";
		inventory[1]="나";
		System.out.println(inventory[0]);
		System.out.println(inventory[1]);
		
		String[] fruit = {"apple","ornage"}; //순서없는 배열
		System.out.println(fruit[0]);
		
		
		
		
	}

}
