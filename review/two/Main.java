package chapter10.review.two;

public class Main {

	public static void main(String[] args) {
		Matango m = new Matango();
		Hero h = new Hero();
		h.run();
		h.attack(m);
		System.out.println("");
		
		SuperHero sh = new SuperHero();
		sh.run();
		sh.attack(m);


	}

}
