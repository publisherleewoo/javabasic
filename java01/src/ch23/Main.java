package ch23;

public class Main {

	public static void main(String[] args) {
		Phone myPhone = new Phone();
		System.out.println(myPhone.getNumber());
		myPhone.setNumber(4564564567L);
		System.out.println(myPhone.getNumber());
		System.out.println(Phone.Model);
	}

}
