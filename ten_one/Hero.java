package chapter10.ten_one;

public class Hero {
	String name = "ミナト";
	int hp = 100;
	
	
	
	//戦う
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃!");
		m.hp -= 5;
		int mFinalHp = m.hp;
		System.out.println("5ポイントのダメージを与えた！");
		System.out.println("お化けキノコ" + m.suffix + "のHPは" + mFinalHp  + "になった");
	}
	
	//転んだ
	public final void slip() {//finalが付いているslipメソッドは子クラスでオーバーライド禁止
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("5のダメージ");
	}
	
	//逃げる
	public void run() {//runメソッドは子クラスでオーバーライド可能
		System.out.println(this.name + "は逃げ出した！");
		
	}
	
/*フィールドはオーバーライドさせない！
 * 親クラス、子クラスで誤って同名のフィールドを宣言すると、意図しない動作をすることがあるため注意
 */
	
	
}

