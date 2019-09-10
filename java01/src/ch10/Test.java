package ch10;

class Person {
	
	// Instance variables
	String name;
	String booldType;
	// class:
	// 1. Data(Property)
	// 2. Methods
	
	void speak() {
		System.out.println("저의 이름은 " + name + "이고 " + "혈액형은 " + booldType +"형 입니다");
	}
	
	String getname() {
		
		return name;
	}
}

public class Test {
	public static void main(String[] args) {
		Person person1 = new Person(); //new는 클래스를 실체화할때 쓰는 예약어
		person1.name = "Lee";
		person1.booldType = "B";
		person1.speak();
		System.out.println("person1.getname() : "+person1.getname());
		
		String strVal = person1.getname();
		System.out.println("strVal : " + strVal);
		Person person2 = new Person();
		person2.name="Jera";
		person2.booldType="b";
		person2.speak();
		System.out.println(person1.name);
		System.out.println(person2.name);
	}
}
