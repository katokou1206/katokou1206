package chapter10.Exercises;

public class PoisonMatango extends Matango {
	int poisonCount = 5;
	char suffix;


	Matango m = new Matango('C');
	Hero h = new Hero();


	public PoisonMatango(char suffix) {
		super(suffix);


		m.attack(h);
		if ( 0<this.poisonCount) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int dmg = h.hp /5;
			h.hp -=dmg;
			System.out.println(dmg + "ポイントのダメージ！");
			poisonCount --;
			
		}
	}

}
