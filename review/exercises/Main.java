package chapter10.review.exercises;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		PoisonMatango pm = new PoisonMatango('B');
		Matango m = new Matango('A');

		pm.attack(h);
	}

}
