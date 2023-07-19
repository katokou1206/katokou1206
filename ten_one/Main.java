package chapter10.ten_one;

public class Main {

	public static void main(String[] args) {
		Matango m = new Matango();
		m.suffix = 'A';
		m.hp = 50;
		
		Hero h = new Hero();
		h.run();
		h.attack(m);
		
		SuperHeroRework sh = new SuperHeroRework();
		sh.run();


		
	}

}
