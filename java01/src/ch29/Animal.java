package ch29;

public abstract class Animal {    //동물은 객체가아니라 추상적 클래스
	public void eat() {
		System.out.println("EAT!");
	}
	public abstract void move();  //자식이 하게끔
	
	public void act() {
		eat();
		move();
	}
}