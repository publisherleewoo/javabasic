package ch10test;

class Person{
	String name;
	int age;
	
	void getName(int arg) {
		System.out.println("내이름은" + " " + this.name + "입니다");
		System.out.println(arg);
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person kim = new Person();
		kim.name="kim";
		kim.age=30;
		kim.getName(1);
		
		Person Lee = new Person();
		Lee.name="Lee";
		Lee.age=20;
	}

}
