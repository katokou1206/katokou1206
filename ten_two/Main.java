package chapter10.ten_two;

public class Main {

	public static void main(String[] args) {
		Matango m = new Matango();
		m.hp = 50;
		
		Hero h = new Hero();
		h.run();
		h.attack(m);
		System.out.println("");
		
		
		SuperHeroRework sh = new SuperHeroRework();
		sh.run();
		sh.attack(m);


	}

}
