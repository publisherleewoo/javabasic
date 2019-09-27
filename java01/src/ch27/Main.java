package ch27;

import java.util.ArrayList;

 
class Nation{
	private String name;
	public void setName(String name) {
		this.name = name;
	} 
	public String getName() {
		return this.name;
	} 
}

class City extends Nation{
	
}

public class Main {
	public static void main(String[] args) {
		Nation nation1 = new Nation();
		Nation nation2 = new Nation();
		Nation nation3 = new Nation();
	 
		nation1.setName("korea");
		nation2.setName("japan");
		nation3.setName("china");
		
//		City city1 = new City();
//		City city2 = new City();
//		City city3 = new City();
//		
//		city1.setName("서울");
//		city2.setName("도쿄");
//		city3.setName("베이징");
		
		//어레이리스트에 제네릭 자주쓰니 외울것
		ArrayList<Nation> nationArr = new ArrayList<Nation>(); 
		nationArr.add(nation1);
		nationArr.add(nation2);
		nationArr.add(nation3);
		
		for(Nation nation : nationArr) {
			System.out.println(nation.getName());
		}
		
		
		
	}
}