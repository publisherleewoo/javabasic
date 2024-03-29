package ch22;

class Human{
	void showInfo() {
		System.out.println("All human beings are equal.");
	}
	void talk() {
		System.out.println("say something");
	}
}

class Asian extends Human{
	@Override
	void showInfo() {
		System.out.println("Lee is an Asian");
	}
	void greeting() {
		System.out.println("Hello > <b");
	}
}

public class Main {
	public static void main(String[] args) {
		
		Asian test = new Asian();
		test.greeting();
		test.talk();
	
		Human test2 = new Asian();
		test2.showInfo();
		
		Human human = new Human();
		Asian asian = new Asian();
		
		Human Lee = human;
		Human Kim = human;
		
	}
}
