package ch25;

class Mother{
	public void intro() {
		System.out.println("Mother");
	}
}

class Son extends Mother{
	//overriding
	public void intro() {
		System.out.println("Son");
	}
	public void say() {
		System.out.println("I love my mom > < b");
	}
}

public class Main {

	public static void main(String[] args) {
		Mother person1 = new Mother();
		Son person2 = new Son();
	
		//person1.intro();
		//person2.intro();
		//person2.say();
		// Up Casting:
		Mother person3 = (Mother) person2;
		person3.intro();
		//error : person3.say();
		
		//Down Casting:
		Son person4 = (Son) person3;
		person4.intro();
		person4.say();
	}

}
