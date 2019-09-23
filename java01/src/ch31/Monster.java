package ch31;

public class Monster {
	
	private String name;
	
	public Monster(String name) {
		this.name=name;
	}
	
	private class Brain {
		public void think() {
			System.out.println(name+" is thinking...");
		}
	}
	
	public void spawn() {
		Brain brain = new Brain();
		brain.think();
	}
}
