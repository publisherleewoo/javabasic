 

public class MyOOP {

	public static void main(String[] args) {
//		//..
//		String delimiter = "----";
//		printA(delimiter);
//		printA(delimiter);
//		printB(delimiter);
//		printB(delimiter);
//		//..
//		delimiter = "****";
//		printA(delimiter);
//		printA(delimiter);
//		printB(delimiter);
//		printB(delimiter);
		 
		// 인스턴스는 Class가 static이 되어있으면 지워야한다..
		Print p1 = new Print();
		p1.delimiter = "****";
		p1.str="A";
		p1.print();
		
		Print p2 = new Print();
		p2.delimiter = "----";
		p2.str="B";
		p2.print();

	}

//	public static void printA(String delimiter) {
//		System.out.println(delimiter);
//		System.out.println("A");
//		System.out.println("A");
//	}
//	public static void printB(String delimiter) {
//		System.out.println(delimiter);
//		System.out.println("B");
//		System.out.println("B");
//	}
	
}
